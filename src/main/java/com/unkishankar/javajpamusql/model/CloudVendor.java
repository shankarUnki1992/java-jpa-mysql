package com.unkishankar.javajpamusql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cloud_vendor")
@NoArgsConstructor
@AllArgsConstructor
public class CloudVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vendorId;
    private String vendorName;
    private String vendoraddress;
    private String vendorPhone;

    // public CloudVendor() {
    // }

    // public CloudVendor(String vendorId, String vendorName, String vendoraddress,
    // String vendorPhone) {
    // this.vendorId = vendorId;
    // this.vendorName = vendorName;
    // this.vendoraddress = vendoraddress;
    // this.vendorPhone = vendorPhone;
    // }

    // public String getVendorId() {
    // return vendorId;
    // }

    // public void setVendorId(String vendorId) {
    // this.vendorId = vendorId;
    // }

    // public String getVendorName() {
    // return vendorName;
    // }

    // public void setVendorName(String vendorName) {
    // this.vendorName = vendorName;
    // }

    // public String getVendoraddress() {
    // return vendoraddress;
    // }

    // public void setVendoraddress(String vendoraddress) {
    // this.vendoraddress = vendoraddress;
    // }

    // public String getVendorPhone() {
    // return vendorPhone;
    // }

    // public void setVendorPhone(String vendorPhone) {
    // this.vendorPhone = vendorPhone;
    // }
}
