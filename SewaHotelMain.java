import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class SewaHotelMain {
    public static void main(String[] args) throws IOException{
    
        HitungTarifHotel pesan=new HitungTarifHotel();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //pesan.setNama(JOptionPane.showInputDialog("Masukkan nama kamu, iya kamu"));
        //String msg_nama = "Selamat datang gan " + pesan.getNama();
        //JOptionPane.showMessageDialog(null, msg_nama);
        
        System.out.println("Masukkan nama Kamu : ");
        pesan.setNama(br.readLine());
        
        
        //String alamat;
        //pesan.setAlamat(JOptionPane.showInputDialog("Masukan Alamat"));
        
        System.out.println("Masukkan KodeKamar : ");
        pesan.setKodeKamar(br.readLine());
                
        boolean stt=true;
        while(stt){
            System.out.println("\nPilih Jenis Kamar\n1. Deluxe Room Rp 275.000/hari\n2. Suite Room Rp 300.000/hari\n3. President Room Rp 370.000/hari\nJenis kamar yang dipesan \t: ");;
                try {
                    pesan.setJenis(Integer.parseInt(br.readLine () ));
                } 
                catch (Exception e) {
                }
        if(pesan.getJenis()>3 || pesan.getJenis()<1){
                stt=true;
            //JOptionPane.showMessageDialog(null, "nak nginput seng tenanan", "Ojo ngawur gan", JOptionPane.ERROR_MESSAGE);
            System.out.println("Inputan salah silahkan ulangi lagi");
            }
        else 
            stt=false;
        }
        
        
        boolean stt2=true;
        while(stt2){
        //String status="status \n1. Member \n2. Non Member";
            System.out.println("status \n1. Member \n2. Non Member");
            try {
                //pesan.setStatus(Integer.parseInt(JOptionPane.showInputDialog(status)));
                pesan.setStatus(Integer.parseInt(br.readLine()));
            } 
            catch (Exception e) {
            }
        if(pesan.getStatus()>2 || pesan.getStatus()<1){
            stt2=true;
            //JOptionPane.showMessageDialog(null, "nak nginput seng tenanan", "Ojo ngawur gan", JOptionPane.ERROR_MESSAGE);
            System.out.println("Inputan salah silahkan ulangi lagi");
            }
        else 
            stt2=false;
        }
        
        
        
        //String lama="masukkan lama menginap (Hari)";
        System.out.println("Masukkan lama menginap : ");
        try {
            //pesan.setLama(Integer.parseInt(JOptionPane.showInputDialog(lama)));
            pesan.setLama(Integer.parseInt(br.readLine()));
        } 
        catch (Exception e) {
        }
        

        System.out.println("<==== Hasil Pemesanan =====>"+
        "\nNama \t\t: "+pesan.getNama()+
        "\nAlamat \t\t: "+pesan.getKodeKamar()+
        "\nJenis kamar \t: "+pesan.get_kamar()+
        "\nStatus \t\t :"+pesan.get_status()+
        "\nTarif \t\t :"+pesan.get_tarif()+
        "\nDiskon \t\t :"+pesan.get_diskon()+
        "\nTotal \t\t :"+pesan.get_bayar()
        );
    
    }
}