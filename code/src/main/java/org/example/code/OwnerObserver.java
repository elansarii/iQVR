package org.example.code;

public class OwnerObserver extends Observer {
    private Owner owner;

    public OwnerObserver(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void update(AccidentReport report) {
        System.out.println("Owner " + owner.getName() + " has been notified of the accident report: " + report.getReportId());
    }
}