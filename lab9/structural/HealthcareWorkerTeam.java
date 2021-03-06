package structural.structural;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;


public class HealthcareWorkerTeam implements HealthcareServiceable {
    public Set<HealthcareServiceable> members;



    private Set<HealthcareServiceable> getMembers() {
        if (members == null) {
            members = new LinkedHashSet<>();
        }
        return members;
    }

    public void addMember(HealthcareServiceable member) {
        getMembers().add(member);
    }

    public void removeMember(HealthcareWorker member) { this.members.remove(member); }

    @Override
    public void service() {
        for (HealthcareServiceable member : this.members){
            member.service();
        }
    }

    @Override
    public double getPrice() {
        float totalPrice = 0f;
        for (HealthcareServiceable member : this.members){
            totalPrice += member.getPrice();
        }
        return totalPrice;
    }
}
