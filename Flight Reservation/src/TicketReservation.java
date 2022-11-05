import java.util.*;

public class TicketReservation {
    final List<Passenger> confirmedList = new LinkedList<>();
    final Queue<Passenger> waitingList =new LinkedList<>();

    public boolean bookFlight(Passenger passenger){
        Passenger waitingPas;
        if(waitingList.size() == 3 && confirmedList.size() == 7){
            return false;
        }
        while(confirmedList.size() < 7){
            if(waitingList.size() >0) {
                waitingPas = waitingList.remove();
                confirmedList.add(waitingPas);
            }
            else
                break;
        }
        if(confirmedList.size()<7){
            confirmedList.add(passenger);
        }
        else
            waitingList.add(passenger);
        return true;
    }
    public boolean cancel(String confirmationNumber){
        ListIterator<Passenger> iterator = confirmedList.listIterator();
        iterator.next();
        if(removePassenger(iterator,confirmationNumber)){
            return  true;
        }
        return false;
    }
    public boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber){
        for(int i=0; i< 7; i++){
            if(confirmedList.get(i).getConfirmationNumber().equals(confirmationNumber)) {
                iterator.remove();
                return true;
            }
        }
        if(!waitingList.isEmpty())
            confirmedList.add(waitingList.remove());
        return true;
    }

    @Override
    public String toString() {
        String st = "";
        Passenger waitingPass;
        st += "Confirmed List: \n";
        for (int i = 0 ; i < 7 ; i++){
            st+= confirmedList.get(i).toString() + "\n";
        }
        st += "Waiting List: \n";
        for (int i = 0 ; i < 3 ; i++) {
            waitingPass = waitingList.remove();
            waitingList.add(waitingPass);
            st += waitingPass.toString() + "\n";
        }
        return st;
    }
}

