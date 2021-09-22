package Utilities;

import Esami.*;

public interface SvolgimentoEsameInterface {
    public void partecipaLezioneEsame(Esame esame) throws InvalidPartecipaException;
    public void iscrizioneEsame(Esame esame) throws InvalidIscrizioneException, InvalidNumberExamsException;
}
