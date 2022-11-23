package com.peaksoft.repository;

import com.peaksoft.model.Company;

import java.util.List;

public interface CompanyRepository {
    void addCompany(Company company);
    void updateCompany(Company company);
    List<Company> getAllCompany();
    Company getByIdCompany(Long id);
    void deleteByIdCompany(Long id);
}
