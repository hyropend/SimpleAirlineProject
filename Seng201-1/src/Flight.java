public class Flight {

    private String flightNo="";
    private int maxSeats=25;
    private int noOfPassanger=0;
    String[] list= new String[maxSeats];

    public Flight(String flightNo, int maxSeats, int noOfPassanger){
        this.flightNo=flightNo;
        this.maxSeats=maxSeats;
        this.noOfPassanger=noOfPassanger;
    }
    public Flight(){
    }
    public boolean reserveSeat(String name){
        if(noOfPassanger<maxSeats){
            list[noOfPassanger]=name;
            noOfPassanger++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean cancelRez(String name){
        for(int i=0;i<maxSeats;i++){
            if(list[i].equals(name)){
                list[i]="";
                noOfPassanger--;
                for(int o=i;o<maxSeats;o++)
                    list[i]=list[i+1];
                return true;
            }
            else{
                continue;
            }
        }
        return false;
    }
    public int numberOfPassangers(){
        return noOfPassanger;
    }
    public void printPassangers(){
        for(int i=0;i<noOfPassanger;i++){
            System.out.println((i+1)+". passanger: "+list[i]);
        }
    }

    public void setFlightNo(String flightNo){
        this.flightNo=flightNo;
    }
    public String getFlightNo(){
        return flightNo;
    }

    public void setMaxSeats(int maxSeats){
        this.maxSeats=maxSeats;
    }
    public int getMaxSeats(){
        return maxSeats;
    }

    public void setNoOfPassanger(int noOfPassanger){
        this.noOfPassanger=noOfPassanger;
    }
    public int getNoOfPassanger(){
        return noOfPassanger;
    }
}
