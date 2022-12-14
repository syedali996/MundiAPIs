// <copyright file="BasicAuthManager.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace MundiAPI.Standard.Authentication
{
    using System;
    using System.Collections.Generic;
    using System.Text;
    using System.Threading.Tasks;
    using MundiAPI.Standard.Http.Request;

    /// <summary>
    /// BasicAuthManager Class.
    /// </summary>
    internal class BasicAuthManager : IBasicAuthCredentials, IAuthManager
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IrisBasicAuthManager"/> class.
        /// </summary>
        /// <param name="username"> Username.</param>
        /// <param name="password"> Password.</param>
        public BasicAuthManager(string username, string password)
        {
            this.BasicAuthUserName = username;
            this.BasicAuthPassword = password;
        }

        /// <summary>
        /// Gets string value for basicAuthUserName.
        /// </summary>
        public string BasicAuthUserName { get; }

        /// <summary>
        /// Gets string value for basicAuthPassword.
        /// </summary>
        public string BasicAuthPassword { get; }

        /// <summary>
        /// Check if credentials match.
        /// </summary>
        /// <param name="basicAuthUserName"> The string value for credentials.</param>
        /// <param name="basicAuthPassword"> The string value for credentials.</param>
        /// <returns> True if credentials matched.</returns>
        public bool Equals(string basicAuthUserName, string basicAuthPassword)
        {
            return basicAuthUserName.Equals(this.BasicAuthUserName)
                    && basicAuthPassword.Equals(this.BasicAuthPassword);
        }

        /// <summary>
        /// Adds authentication to the given HttpRequest.
        /// </summary>
        /// <param name="httpRequest">Http Request.</param>
        /// <returns>Returns the httpRequest after adding authentication.</returns>
        public HttpRequest Apply(HttpRequest httpRequest)
        {
            string authCredentials = this.BasicAuthUserName + ":" + this.BasicAuthPassword;
            byte[] data = Encoding.ASCII.GetBytes(authCredentials);
            httpRequest.Headers["Authorization"] = "Basic " + Convert.ToBase64String(data);
            return httpRequest;
        }

        /// <summary>
        /// Adds authentication to the given HttpRequest.
        /// </summary>
        /// <param name="httpRequest">Http Request.</param>
        /// <returns>Returns the httpRequest after adding authentication.</returns>
        public Task<HttpRequest> ApplyAsync(HttpRequest httpRequest)
        {
            string authCredentials = this.BasicAuthUserName + ":" + this.BasicAuthPassword;
            byte[] data = Encoding.ASCII.GetBytes(authCredentials);
            httpRequest.Headers["Authorization"] = "Basic " + Convert.ToBase64String(data);
            return Task.FromResult(httpRequest);
        }
    }
}