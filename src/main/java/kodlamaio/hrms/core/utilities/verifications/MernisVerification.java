package kodlamaio.hrms.core.utilities.verifications;

import kodlamaio.hrms.entities.concretes.people.Candidate;

public class MernisVerification extends Verification {

    private Candidate candidate;

    public MernisVerification(String message) {
        super(message);
    }

    public MernisVerification(String message, Candidate candidate) {
        super(message);
        this.candidate = candidate;
    }

    public boolean isChecked() {
        return this.candidate.equals("0a");
    }

}
