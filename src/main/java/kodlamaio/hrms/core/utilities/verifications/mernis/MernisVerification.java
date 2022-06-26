package kodlamaio.hrms.core.utilities.verifications.mernis;

import kodlamaio.hrms.core.utilities.verifications.mernis.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;

public class MernisVerification {

    public static boolean checkMernis(long nationalityNumber, String name, String lastName, int birthDate) throws RemoteException {
        return new KPSPublicSoapProxy().TCKimlikNoDogrula(nationalityNumber, name, lastName, birthDate);
    }

}
