package pojo;

import java.util.HashMap;
import java.util.Map;

public class CategoryColors {

    private String İndividual;
    private String Packages;
    private String GroupSession;
    private String ShowedUp;
    private String Reschedule;
    private String Canceled;
    private String Noshow;

    // formData için gerekli, body bölümünde açlışıyor olsaydık buna gerek olmaayacaktı.
    public Map<String, String> getMap(){
        Map<String, String> map = new HashMap<>();
        map.put("İndividual", getIndividual());
        map.put("Packages", getPackages());
        map.put("GroupSession", getGroupSession());
        map.put("ShowedUp", getShowedUp());
        map.put("Reschedule", getReschedule());
        map.put("Canceled", getCanceled());
        map.put("Noshow", getNoshow());

        return map;
    }

    public String getIndividual() {
        return İndividual;
    }

    public void setIndividual(String individual) {
        İndividual = individual;
    }

    public String getPackages() {
        return Packages;
    }

    public void setPackages(String packages) {
        Packages = packages;
    }

    public String getGroupSession() {
        return GroupSession;
    }

    public void setGroupSession(String groupSession) {
        GroupSession = groupSession;
    }

    public String getShowedUp() {
        return ShowedUp;
    }

    public void setShowedUp(String showedUp) {
        ShowedUp = showedUp;
    }

    public String getReschedule() {
        return Reschedule;
    }

    public void setReschedule(String reschedule) {
        Reschedule = reschedule;
    }

    public String getCanceled() {
        return Canceled;
    }

    public void setCanceled(String canceled) {
        Canceled = canceled;
    }

    public String getNoshow() {
        return Noshow;
    }

    public void setNoshow(String noshow) {
        Noshow = noshow;
    }



}
