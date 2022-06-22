package kodlamaio.hrms.core.utilities.verifications;

import kodlamaio.hrms.entities.concretes.people.Candidate;
import kodlamaio.hrms.entities.concretes.people.Employer;

public class EMailVerification extends Verification {

    private Employer employer;

    public EMailVerification(String message, Employer employer) {
        super(message);
        this.employer = employer;
    }

    public boolean isChecked() {
        return !this.employer.getEMail().equals("as");
    }

}
