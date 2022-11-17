// <copyright file="GetTransactionReportFileResponse.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace MundiAPI.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using JsonSubTypes;
    using MundiAPI.Standard;
    using MundiAPI.Standard.Utilities;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;

    /// <summary>
    /// GetTransactionReportFileResponse.
    /// </summary>
    public class GetTransactionReportFileResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetTransactionReportFileResponse"/> class.
        /// </summary>
        public GetTransactionReportFileResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GetTransactionReportFileResponse"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="date">date.</param>
        public GetTransactionReportFileResponse(
            string name,
            DateTime date)
        {
            this.Name = name;
            this.Date = date;
        }

        /// <summary>
        /// Gets or sets Name.
        /// </summary>
        [JsonProperty("name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets Date.
        /// </summary>
        [JsonConverter(typeof(IsoDateTimeConverter))]
        [JsonProperty("date")]
        public DateTime Date { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"GetTransactionReportFileResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is GetTransactionReportFileResponse other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                this.Date.Equals(other.Date);
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Date = {this.Date}");
        }
    }
}