package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.verifications.mernis.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.people.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("Aday eklendi!");
    }

    @Override
    public boolean checkMernis(String name, String lastName, long nationalityNumber, int birthDate) {
        KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
        boolean result;
        try {
            result = kpsPublicSoapProxy.TCKimlikNoDogrula(nationalityNumber, name, lastName, birthDate);
        } catch (Exception e) {
            return false;
        }
        return result;
    }
}
