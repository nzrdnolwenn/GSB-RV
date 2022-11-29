package fr.gsb.gsbrvdr;

public class Session {

    private boolean etatSession = false ;

    public Session(boolean etatSession) {
        this.etatSession = etatSession;
    }

    public boolean isEtatSession() {
        return etatSession;
    }

    public void setEtatSession(boolean etatSession) {
        this.etatSession = etatSession;
    }

    @Override
    public String toString() {
        return "Session{" +
                "etatSession=" + etatSession +
                '}';
    }
}
