package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.core.utilities.verifications.mernis.MernisVerification;
import kodlamaio.hrms.core.utilities.verifications.mernis.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.people.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Candidateler listelendi!");
    }

    @Override
    public Result add(Candidate candidate) throws RemoteException {
        if (MernisVerification.checkMernis(candidate.getNationalityNumber(), candidate.getName(), candidate.getLastName(), candidate.getBirthYear())) {
            this.candidateDao.save(candidate);
            return new SuccessResult("Aday eklendi!");
        } else {
            return new ErrorResult("Aday eklenemedi, Mernis doğrulaması başarısız!");
        }
    }

}
