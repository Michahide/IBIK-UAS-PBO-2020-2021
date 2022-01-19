package UAS.soal.satu.sampai.enam;

import java.net.URL;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Users{
	private Long NIK; //Diubah ke Long karena rentang Integer tidak cukup untuk data yang dimasukkan
	private String Fullname;
	private String Address;
	
	public Long getNIK() {
		return NIK;
	}
	public void setNIK(Long nIK) { //Diubah ke Long karena rentang Integer tidak cukup untuk data yang dimasukkan
		NIK = nIK;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}	
}

class Profile extends Users{
	private String Avatar;

	public String getAvatar() {
		return Avatar;
	}

	
	public Image fetchingAvatar() throws IOException {
		URL url = new URL(Avatar);
        Image image = ImageIO.read(url);
        return image;
	}


	public void setAvatar(String imageAvatar) { //Menambahkan setter untuk attribute Avatar
		Avatar = imageAvatar; //Mengatur variabel nilai Avatar = imageAvatar
	}
}

public class Main extends JFrame{	
	private Long NIK = 3202310072L; //Diubah ke Long karena rentang Integer tidak cukup untuk data yang dimasukkan
	private String Fullname = "Doctor Stephen Vincent Strange M.D., Ph.D";
	private String Address = "The mansion of Doctor Stephen Strange is located at 177A Bleecker Street, "
							+ "New York City, NY 10012-1406";
	private String ImageAvatar = "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/e/e0/"
								+"Doctor_Strange_%28No_Way_Home%29_profile_pic.jpg/revision/latest/"
								+ "top-crop/width/100/height/100?cb=20210906002003";
	
	public static void main(String[] args) {
		
		
		Main frame = new Main();
        frame.setSize(480,180);
        frame.setTitle("Profile User");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().setLayout(null);
        frame.initialize(frame);//memanggil method initialize dengan parameter frame
        frame.setVisible(true); //set window bisa dilihat karena nilainya = true
        
        
	}
	
	//method initialize
	private void initialize (JFrame frame) {
		int positionX = 20;
		int positionY = 130;
		Main main = new Main(); //initialisasi object main pada class Main
		
		Profile myprofile = new Profile();
        myprofile.setNIK(main.NIK); //mengubah dari frame.NIK menjadi main.NIK
        myprofile.setFullname(main.Fullname); //mengubah dari frame.Fullname menjadi main.Fullname
        myprofile.setAddress(main.Address); //mengubah dari frame.Address menjadi main.Address
        myprofile.setAvatar(main.ImageAvatar); //mengubah dari frame.ImageAvatar menjadi main.ImageAvatar        
        
        JLabel labelImage = new JLabel();
        try {
			Image avatar = myprofile.fetchingAvatar();
			labelImage = new JLabel(new ImageIcon(avatar));
		} catch (IOException e) {
			labelImage.setText("Failed load image");
			e.printStackTrace();
		}
        labelImage.setBounds(20, 20, 100, 100);
        frame.getContentPane().add(labelImage);
        
        JLabel labelNIK = new JLabel();
        labelNIK.setText("NIK: "+myprofile.getNIK());
        labelNIK.setBounds(positionY, positionX, 150, 14);
        frame.getContentPane().add(labelNIK);
        
        positionX = positionX  + 20;
        JLabel labelFullname = new JLabel();
        labelFullname.setText("Name: "+myprofile.getFullname());
        labelFullname.setBounds(positionY, positionX, 450, 14);
        frame.getContentPane().add(labelFullname); //membuat content pane dari frame dengan menambahkan labelFullname ke frame
        
        positionX = positionX  + 20;
        JLabel labelAddress= new JLabel();
        labelAddress.setText("Address:");
        labelAddress.setBounds(positionY, positionX, 300, 14);
        frame.getContentPane().add(labelAddress); //membuat content pane dari frame dengan menambahkan labelAddress ke frame
        
        
        positionX = positionX  + 15;
        JLabel textAddress= new JLabel();
        textAddress.setText("<html>"+myprofile.getAddress()+"</html>");
        textAddress.setBounds(positionY, positionX, 300, 50);
        frame.getContentPane().add(textAddress);
	}
}
