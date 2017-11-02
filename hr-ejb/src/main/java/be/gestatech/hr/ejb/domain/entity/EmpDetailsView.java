/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.gestatech.hr.ejb.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amuri
 */
@Entity
@Table(name = "emp_details_view", catalog = "hr_dev", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpDetailsView.findAll", query = "SELECT e FROM EmpDetailsView e")
    , @NamedQuery(name = "EmpDetailsView.findByEmployeeId", query = "SELECT e FROM EmpDetailsView e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "EmpDetailsView.findByJobId", query = "SELECT e FROM EmpDetailsView e WHERE e.jobId = :jobId")
    , @NamedQuery(name = "EmpDetailsView.findByManagerId", query = "SELECT e FROM EmpDetailsView e WHERE e.managerId = :managerId")
    , @NamedQuery(name = "EmpDetailsView.findByDepartmentId", query = "SELECT e FROM EmpDetailsView e WHERE e.departmentId = :departmentId")
    , @NamedQuery(name = "EmpDetailsView.findByLocationId", query = "SELECT e FROM EmpDetailsView e WHERE e.locationId = :locationId")
    , @NamedQuery(name = "EmpDetailsView.findByCountryId", query = "SELECT e FROM EmpDetailsView e WHERE e.countryId = :countryId")
    , @NamedQuery(name = "EmpDetailsView.findByFirstName", query = "SELECT e FROM EmpDetailsView e WHERE e.firstName = :firstName")
    , @NamedQuery(name = "EmpDetailsView.findByLastName", query = "SELECT e FROM EmpDetailsView e WHERE e.lastName = :lastName")
    , @NamedQuery(name = "EmpDetailsView.findBySalary", query = "SELECT e FROM EmpDetailsView e WHERE e.salary = :salary")
    , @NamedQuery(name = "EmpDetailsView.findByCommissionPct", query = "SELECT e FROM EmpDetailsView e WHERE e.commissionPct = :commissionPct")
    , @NamedQuery(name = "EmpDetailsView.findByDepartmentName", query = "SELECT e FROM EmpDetailsView e WHERE e.departmentName = :departmentName")
    , @NamedQuery(name = "EmpDetailsView.findByJobTitle", query = "SELECT e FROM EmpDetailsView e WHERE e.jobTitle = :jobTitle")
    , @NamedQuery(name = "EmpDetailsView.findByCity", query = "SELECT e FROM EmpDetailsView e WHERE e.city = :city")
    , @NamedQuery(name = "EmpDetailsView.findByStateProvince", query = "SELECT e FROM EmpDetailsView e WHERE e.stateProvince = :stateProvince")
    , @NamedQuery(name = "EmpDetailsView.findByCountryName", query = "SELECT e FROM EmpDetailsView e WHERE e.countryName = :countryName")
    , @NamedQuery(name = "EmpDetailsView.findByRegionName", query = "SELECT e FROM EmpDetailsView e WHERE e.regionName = :regionName")})
public class EmpDetailsView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employee_id", nullable = false)
    private int employeeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "job_id", nullable = false, length = 10)
    private String jobId;
    @Column(name = "manager_id")
    private Integer managerId;
    @Column(name = "department_id")
    private Integer departmentId;
    @Column(name = "location_id")
    private Integer locationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "country_id", nullable = false, length = 2)
    private String countryId;
    @Size(max = 20)
    @Column(name = "first_name", length = 20)
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, precision = 8, scale = 2)
    private BigDecimal salary;
    @Column(name = "commission_pct", precision = 2, scale = 2)
    private BigDecimal commissionPct;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "department_name", nullable = false, length = 30)
    private String departmentName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "job_title", nullable = false, length = 35)
    private String jobTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(nullable = false, length = 30)
    private String city;
    @Size(max = 25)
    @Column(name = "state_province", length = 25)
    private String stateProvince;
    @Size(max = 40)
    @Column(name = "country_name", length = 40)
    private String countryName;
    @Size(max = 25)
    @Column(name = "region_name", length = 25)
    private String regionName;

    public EmpDetailsView() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

}
