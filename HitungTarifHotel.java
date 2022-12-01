public class HitungTarifHotel extends EntitasSewaHotel{
    private int tarif;
    private double diskon;
    private double bayar;
    private String kamar;
    private String ostatus;

    public HitungTarifHotel() {
    }

    public String get_status(){
        if(status==1)
            ostatus="Member";
        else if(status==2)
            ostatus="Non Member";
    
        return ostatus;
    }
        
    public int get_tarif(){
        if(jenis==1){
            //kamar="Deluxe ";
            tarif = lama*275000;
        }  
        else if (jenis==2){
            //kamar="Suite";
            tarif = lama*300000;
        }
        else if (jenis==3){
            //kamar="President";
            tarif = lama*375000;
        }
        else{
        }
        return tarif;
    }

    public String get_kamar(){
        if(jenis==1){
            kamar="Deluxe ";
            //tarif = lama*275000;
        }  
        else if (jenis==2){
            kamar="Suite";
            //tarif = lama*300000;
        }
        else if (jenis==3){
            kamar="President";
            //tarif = lama*375000;
        }
        else{
        }
        return kamar;
    }


    public double get_diskon(){
        if (status==1){
            if(lama>=4 && lama<=7){
            diskon = 0.20 * tarif;
            }
            else if (lama>7) {
            diskon = 0.35 * tarif;
            }
        }
        else if (status==2){
            if (lama>=4 && lama<=7){
            diskon = 0.10 * tarif;
            }
            else if (lama>7){
            diskon = 0.15 * tarif;
            }
        }   
        return diskon;
    }
    
    public double get_bayar(){
        return tarif-diskon;
    }  
} 