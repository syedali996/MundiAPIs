// <copyright file="GetPixPayerResponse.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace PagarmeCoreApi.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using JsonSubTypes;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using PagarmeCoreApi.Standard;
    using PagarmeCoreApi.Standard.Utilities;

    /// <summary>
    /// GetPixPayerResponse.
    /// </summary>
    public class GetPixPayerResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetPixPayerResponse"/> class.
        /// </summary>
        public GetPixPayerResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GetPixPayerResponse"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="document">document.</param>
        /// <param name="documentType">document_type.</param>
        /// <param name="bankAccount">bank_account.</param>
        public GetPixPayerResponse(
            string name = null,
            string document = null,
            string documentType = null,
            Models.GetPixBankAccountResponse bankAccount = null)
        {
            this.Name = name;
            this.Document = document;
            this.DocumentType = documentType;
            this.BankAccount = bankAccount;
        }

        /// <summary>
        /// Gets or sets Name.
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Include)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets Document.
        /// </summary>
        [JsonProperty("document", NullValueHandling = NullValueHandling.Include)]
        public string Document { get; set; }

        /// <summary>
        /// Gets or sets DocumentType.
        /// </summary>
        [JsonProperty("document_type", NullValueHandling = NullValueHandling.Include)]
        public string DocumentType { get; set; }

        /// <summary>
        /// Gets or sets BankAccount.
        /// </summary>
        [JsonProperty("bank_account", NullValueHandling = NullValueHandling.Include)]
        public Models.GetPixBankAccountResponse BankAccount { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"GetPixPayerResponse : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }

            return obj is GetPixPayerResponse other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Document == null && other.Document == null) || (this.Document?.Equals(other.Document) == true)) &&
                ((this.DocumentType == null && other.DocumentType == null) || (this.DocumentType?.Equals(other.DocumentType) == true)) &&
                ((this.BankAccount == null && other.BankAccount == null) || (this.BankAccount?.Equals(other.BankAccount) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Document = {(this.Document == null ? "null" : this.Document == string.Empty ? "" : this.Document)}");
            toStringOutput.Add($"this.DocumentType = {(this.DocumentType == null ? "null" : this.DocumentType == string.Empty ? "" : this.DocumentType)}");
            toStringOutput.Add($"this.BankAccount = {(this.BankAccount == null ? "null" : this.BankAccount.ToString())}");
        }
    }
}