// <copyright file="GetDiscountResponse.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace PagarmeApiSDK.Standard.Models
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
    using PagarmeApiSDK.Standard;
    using PagarmeApiSDK.Standard.Utilities;

    /// <summary>
    /// GetDiscountResponse.
    /// </summary>
    public class GetDiscountResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetDiscountResponse"/> class.
        /// </summary>
        public GetDiscountResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GetDiscountResponse"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="mValue">value.</param>
        /// <param name="discountType">discount_type.</param>
        /// <param name="status">status.</param>
        /// <param name="createdAt">created_at.</param>
        /// <param name="cycles">cycles.</param>
        /// <param name="deletedAt">deleted_at.</param>
        /// <param name="description">description.</param>
        /// <param name="subscription">subscription.</param>
        /// <param name="subscriptionItem">subscription_item.</param>
        public GetDiscountResponse(
            string id,
            double mValue,
            string discountType,
            string status,
            DateTime createdAt,
            int? cycles = null,
            DateTime? deletedAt = null,
            string description = null,
            Models.GetSubscriptionResponse subscription = null,
            Models.GetSubscriptionItemResponse subscriptionItem = null)
        {
            this.Id = id;
            this.MValue = mValue;
            this.DiscountType = discountType;
            this.Status = status;
            this.CreatedAt = createdAt;
            this.Cycles = cycles;
            this.DeletedAt = deletedAt;
            this.Description = description;
            this.Subscription = subscription;
            this.SubscriptionItem = subscriptionItem;
        }

        /// <summary>
        /// Gets or sets Id.
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// Gets or sets MValue.
        /// </summary>
        [JsonProperty("value")]
        public double MValue { get; set; }

        /// <summary>
        /// Gets or sets DiscountType.
        /// </summary>
        [JsonProperty("discount_type")]
        public string DiscountType { get; set; }

        /// <summary>
        /// Gets or sets Status.
        /// </summary>
        [JsonProperty("status")]
        public string Status { get; set; }

        /// <summary>
        /// Gets or sets CreatedAt.
        /// </summary>
        [JsonConverter(typeof(IsoDateTimeConverter))]
        [JsonProperty("created_at")]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or sets Cycles.
        /// </summary>
        [JsonProperty("cycles", NullValueHandling = NullValueHandling.Ignore)]
        public int? Cycles { get; set; }

        /// <summary>
        /// Gets or sets DeletedAt.
        /// </summary>
        [JsonConverter(typeof(IsoDateTimeConverter))]
        [JsonProperty("deleted_at", NullValueHandling = NullValueHandling.Ignore)]
        public DateTime? DeletedAt { get; set; }

        /// <summary>
        /// Gets or sets Description.
        /// </summary>
        [JsonProperty("description", NullValueHandling = NullValueHandling.Ignore)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or sets Subscription.
        /// </summary>
        [JsonProperty("subscription", NullValueHandling = NullValueHandling.Ignore)]
        public Models.GetSubscriptionResponse Subscription { get; set; }

        /// <summary>
        /// The subscription item
        /// </summary>
        [JsonProperty("subscription_item", NullValueHandling = NullValueHandling.Ignore)]
        public Models.GetSubscriptionItemResponse SubscriptionItem { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"GetDiscountResponse : ({string.Join(", ", toStringOutput)})";
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

            return obj is GetDiscountResponse other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                this.MValue.Equals(other.MValue) &&
                ((this.DiscountType == null && other.DiscountType == null) || (this.DiscountType?.Equals(other.DiscountType) == true)) &&
                ((this.Status == null && other.Status == null) || (this.Status?.Equals(other.Status) == true)) &&
                this.CreatedAt.Equals(other.CreatedAt) &&
                ((this.Cycles == null && other.Cycles == null) || (this.Cycles?.Equals(other.Cycles) == true)) &&
                ((this.DeletedAt == null && other.DeletedAt == null) || (this.DeletedAt?.Equals(other.DeletedAt) == true)) &&
                ((this.Description == null && other.Description == null) || (this.Description?.Equals(other.Description) == true)) &&
                ((this.Subscription == null && other.Subscription == null) || (this.Subscription?.Equals(other.Subscription) == true)) &&
                ((this.SubscriptionItem == null && other.SubscriptionItem == null) || (this.SubscriptionItem?.Equals(other.SubscriptionItem) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.MValue = {this.MValue}");
            toStringOutput.Add($"this.DiscountType = {(this.DiscountType == null ? "null" : this.DiscountType == string.Empty ? "" : this.DiscountType)}");
            toStringOutput.Add($"this.Status = {(this.Status == null ? "null" : this.Status == string.Empty ? "" : this.Status)}");
            toStringOutput.Add($"this.CreatedAt = {this.CreatedAt}");
            toStringOutput.Add($"this.Cycles = {(this.Cycles == null ? "null" : this.Cycles.ToString())}");
            toStringOutput.Add($"this.DeletedAt = {(this.DeletedAt == null ? "null" : this.DeletedAt.ToString())}");
            toStringOutput.Add($"this.Description = {(this.Description == null ? "null" : this.Description == string.Empty ? "" : this.Description)}");
            toStringOutput.Add($"this.Subscription = {(this.Subscription == null ? "null" : this.Subscription.ToString())}");
            toStringOutput.Add($"this.SubscriptionItem = {(this.SubscriptionItem == null ? "null" : this.SubscriptionItem.ToString())}");
        }
    }
}