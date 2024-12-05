package org.example.code;

public class InsuranceCompanyObserver extends Observer {
    private InsuranceCompany insuranceCompany;

    public InsuranceCompanyObserver(InsuranceCompany insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    @Override
    public void update(AccidentReport report) {
        System.out.println("Insurance Company has been notified of the accident report: " + report.getReportId());
        insuranceCompany.acknowledgeAccident(report);
    }
}