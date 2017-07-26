import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Acquaintance implements Serializable 
{
   
	private static final long serialVersionUID = 1L;
	private String name;
    private String mobile;
    private String email;
    
    public Acquaintance(String name, String mobile, String email)
    {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }
    
    public Acquaintance()
    {
        name = null;
        mobile = null;
        email = null;
    }
            
    public String GetName(){
        return name;
    }
    public String GetMobNo(){
        return mobile;
    }
    public String GetEmail(){
        return email;
    }
    public void SetName(String S){
        name = S;
    }
    public void SetMobNo(String S){
    	mobile = S;
    }
    public void SetEmail(String S){
        email = S;
    }
    
    public void PrintDetails(){
        System.out.println("Name : " + name);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("Email ID : " + email);
    }
    public void CreateAcquaintance(){
    	
    }
}



class Relative extends Acquaintance implements Serializable 
{
    private String Bdate;
    private String last_meeting_date;
    
    public Relative(String name, String MobNo, String email, String Bdate, String last_meeting_date){
        super(name,MobNo,email);
        this.Bdate = Bdate;
        this.last_meeting_date = last_meeting_date;
    }

    public Relative() {
       super();
       Bdate = null;
       last_meeting_date = null;
    }
    public String GetBdate(){
        return Bdate;
    }
    public String GetLastMeetingDate(){
        return last_meeting_date;
    }
     public void SetBdate(String S){
        Bdate = S;
    }
      public void SetLastMeetingDate(String S){
        last_meeting_date = S;
    }
    @Override
      public void PrintDetails(){
          super.PrintDetails();
          System.out.print("Birth Date : " + Bdate);
          System.out.print("Last Meeting Date : " + last_meeting_date);
      }
    
      public void CreateAcquaintance(){
    	  
    	JFrame frame = new JFrame();
    	frame.setBounds(100, 100, 450, 300);
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		frame.getContentPane().setLayout(null);
  		
        System.out.println("CREATING RELATIVE");
          
        final JTextField textField;
        final JTextField textField_1;
        final JTextField textField_2;
     	final JTextField textField_3;
     	final JTextField textField_4;
     	 
     	JLabel lblName = new JLabel("NAME : ");
 		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
 		lblName.setBounds(24, 21, 56, 14);
 		frame.getContentPane().add(lblName);
 		
 		textField = new JTextField();
 		textField.setBounds(115, 19, 86, 20);
 		frame.getContentPane().add(textField);
 		textField.setColumns(10);
 		
 		JLabel lblMobileNumber = new JLabel("Mobile Number :");
 		lblMobileNumber.setBounds(24, 52, 86, 14);
 		frame.getContentPane().add(lblMobileNumber);
 		
 		textField_1 = new JTextField();
 		textField_1.setBounds(115, 49, 86, 20);
 		frame.getContentPane().add(textField_1);
 		textField_1.setColumns(10);
 		
 		JLabel lblEmail = new JLabel("EMAIL : ");
 		lblEmail.setBounds(24, 83, 46, 14);
 		frame.getContentPane().add(lblEmail);
 		
 		textField_2 = new JTextField();
 		textField_2.setBounds(115, 80, 86, 20);
 		frame.getContentPane().add(textField_2);
 		textField_2.setColumns(10);
          JLabel lblBdate = new JLabel("B'Date : ");
  		lblBdate.setBounds(38, 127, 46, 14);
  		frame.getContentPane().add(lblBdate);
  		
  		textField_3 = new JTextField();
  		textField_3.setBounds(152, 124, 86, 20);
  		frame.getContentPane().add(textField_3);
  		textField_3.setColumns(10);
  		frame.setVisible(true);
  		
  		JLabel lblLastMeetingDate = new JLabel("Last meeting date : ");
		lblLastMeetingDate.setBounds(38, 160, 102, 14);
		frame.getContentPane().add(lblLastMeetingDate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(152, 155, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		frame.setVisible(true);
  		
  		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetName( textField.getText() );
				SetMobNo( textField_1.getText());
				SetEmail( textField_2.getText());
				SetBdate( textField_3.getText());
				SetLastMeetingDate( textField_4.getText());
				
			}
		});
		
		btnSubmit.setBounds(149, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		frame.setVisible(true);
       
      }
      
}

class PersonalFriend extends Acquaintance implements Serializable {
    private String context;
    private String date;
    private String events;
    
    public PersonalFriend(String name, String MobNo, String email, String context, String date, String events){
        super(name,MobNo,email);
        this.context = context;
        this.date = date;
        this.events = events;
    }
    public PersonalFriend(){
        super();
        context = null;
        date = null;
        events = null;
    }
    
    public String GetContext(){
        return context;
    }
    public String GetDate(){
        return date;
    }
    public String GetEvents(){
        return events;
    }
    public void SetContext(String S){
        context = S;
    }
    public void SetDate(String S){
        date = S;
    }
    public void SetEvents(String S){
        events = S;
    }
    @Override
      public void PrintDetails(){
          super.PrintDetails();
          System.out.println(" Context: " + context);
          System.out.println("Date : " + date);
          System.out.println("Events : " + events);
      }
      @Override
      public void CreateAcquaintance(){
          Scanner in = new Scanner(System.in);
          super.CreateAcquaintance();
          System.out.print("Context : " );
          this.SetContext( in.nextLine() );
          System.out.print("Date : " );
          this.SetDate( in.nextLine() );
          System.out.print("events : ");
          this.SetEvents( in.nextLine() );
      }
    
}

class ProfessionalFriend extends Acquaintance implements Serializable {
    private String CommonProfessionalInterests;
    
   public ProfessionalFriend(String name, String MobNo, String email, String CommonProfessionalInterests){
        super(name,MobNo,email);
        this.CommonProfessionalInterests = CommonProfessionalInterests;
    }
   public ProfessionalFriend(){
       super();
       CommonProfessionalInterests = null;
   }
    public String GetCommonProfessionalInterests(){
        return CommonProfessionalInterests;
    }
    public void SetCommonProfessionalInterests(String A){
        CommonProfessionalInterests = A;
    }
    
    @Override
      public void PrintDetails(){
          super.PrintDetails();
          System.out.println(" Common Professional Interests: " + CommonProfessionalInterests);
      }
      @Override
      public void CreateAcquaintance(){
          Scanner in = new Scanner(System.in);
          super.CreateAcquaintance();
          System.out.print("Common Professional Interests : " );
          this.SetCommonProfessionalInterests(in.nextLine() );
      }
    
}

class CasualAcquaintance extends Acquaintance implements Serializable {
    private String when_met;
    private String where_met;
    private String circumstances_of_meeting;
    private String other_info;
    
    public CasualAcquaintance(String name, String MobNo, String email, String when_met, String where_met, String circumstances_of_meeting, String other_info){
        super(name,MobNo,email);
        this.when_met = when_met;
        this.where_met = where_met;
        this.circumstances_of_meeting = circumstances_of_meeting;
        this.other_info = other_info;
    }
    public CasualAcquaintance(){
        super();
        when_met = null;
        where_met = null;
        circumstances_of_meeting = null; 
        other_info= null;
    }
    
    public String GetWhenMet(){
        return when_met;
    }
    public String GetWhereMet(){
        return where_met;
    }
    public String GetCircumstancesOfMeeting(){
        return circumstances_of_meeting;
    }
    public String GetOtherInfo(){
        return other_info;
    }
    public void SetWhenMet(String S){
        when_met = S;
    }
    public void SetWhereMet(String S){
        where_met = S;
    }
    public void SetCircumstancesOfMeeting(String S){
        circumstances_of_meeting = S;
    }
    public void SetOtherInfo(String S){
        other_info = S;
    }
    @Override
      public void PrintDetails(){
          super.PrintDetails();
          System.out.println(" When did we meet : " + when_met);
          System.out.println("Where we met : " + where_met);
          System.out.println("Circumstances of Meeting : " + circumstances_of_meeting);
          System.out.println(" other information : " + other_info);
      }
       @Override
      public void CreateAcquaintance(){
          Scanner in = new Scanner(System.in);
          super.CreateAcquaintance();
          System.out.print("When did we meet : " );
          this.SetWhenMet(in.nextLine() );
          System.out.print("Where we met : " );
          this.SetWhereMet(in.nextLine() );
          System.out.print("Circumstances of Meeting : ");
          this.SetCircumstancesOfMeeting(in.nextLine());
          System.out.print("other information : " );
          this.SetOtherInfo(in.nextLine() );
      }
}

class AcquaintanceList implements Serializable 
{
    private Acquaintance [] list;
    private int no_of_members;
    private int max_size;
    int input = 5;
    
    public AcquaintanceList()
    {
        list = new Acquaintance[100];
        no_of_members = 0;
        max_size = 100;
    }
    
    
    void SaveEverything(){
    	FileOutputStream fout = null;
        try {
                
            fout = new FileOutputStream("vishal.dat");
        } catch (FileNotFoundException ex) {
            
        }
                         try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
                             oos.writeObject(this);
                             oos.flush();
                             oos.close();
                         } catch (IOException ex) {
        }
    	
    }
    public void CreateAcquaintance(){
    	
         final JFrame create_acquaintance = new JFrame();
		create_acquaintance.setBounds(100, 100, 450, 300);
		create_acquaintance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		create_acquaintance.getContentPane().setLayout(null);
		create_acquaintance.setVisible(true);
		create_acquaintance.setTitle("Create Acquaintance");
		
		JLabel lblEnterYourChoice = new JLabel("Enter your choice : ");
		lblEnterYourChoice.setBounds(140, 10, 200, 40);
		lblEnterYourChoice.setFont(new Font("Tahoma", Font.PLAIN, 17));
		create_acquaintance.getContentPane().add(lblEnterYourChoice);
		
		JLabel lblRelative = new JLabel("1. Relative");
		lblRelative.setBounds(20, 42, 74, 14);
		create_acquaintance.getContentPane().add(lblRelative);
		
		JLabel lblCasualAcquaintance = new JLabel("2. Casual Acquaintance");
		lblCasualAcquaintance.setBounds(20, 62, 153, 14);
		create_acquaintance.getContentPane().add(lblCasualAcquaintance);
		
		JLabel lblPersonalFriend = new JLabel("3. Personal Friend");
		lblPersonalFriend.setBounds(20, 82, 153, 14);
		create_acquaintance.getContentPane().add(lblPersonalFriend);
		
		JLabel lblProfessionalFriend = new JLabel("4. Professional Friend");
		lblProfessionalFriend.setBounds(20, 102, 153, 14);
		create_acquaintance.getContentPane().add(lblProfessionalFriend);
		
		final JTextField textField = new JTextField();
		textField.setBounds(30, 136, 86, 20);
		create_acquaintance.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(true);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input = Integer.valueOf(textField.getText());
				if(input <= 0 || input > 4) {
		            System.out.println(input + " is Not possible!! Returning to main menu...");
		            return;
		        }
			     create_acquaintance.setVisible(false);
			     System.out.println("INPUT = " + input);
				CreateAcquaintance(input);
			}
		});
		btnSubmit.setBounds(30, 171, 89, 23);
		create_acquaintance.getContentPane().add(btnSubmit);
    	
      
        
    }
    
    public void CreateAcquaintance(final int input){ 
        
        
        final JFrame frame = new JFrame();
    	frame.setBounds(100, 100, 450, 300);
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		frame.getContentPane().setLayout(null);
  		frame.setTitle("Create Acquaintance");
          
        final JTextField textField;
        final JTextField textField_1;
        final JTextField textField_2;
     	final JTextField textField_3;
     	final JTextField textField_4;
     	final JTextField textField_5;
     	final JTextField textField_6;
     	
     	 
     	JLabel lblName = new JLabel("Name : ");
 		lblName.setBounds(24, 20, 56, 14);
 		frame.getContentPane().add(lblName);
 		
 		textField = new JTextField();
 		textField.setBounds(162, 21, 86, 20);
 		frame.getContentPane().add(textField);
 		textField.setColumns(10);
 		
 		JLabel lblMobileNumber = new JLabel("Mobile Number :");
 		lblMobileNumber.setBounds(24, 50, 100, 14);
 		frame.getContentPane().add(lblMobileNumber);
 		
 		textField_1 = new JTextField();
 		textField_1.setBounds(162, 50, 86, 20);
 		frame.getContentPane().add(textField_1);
 		textField_1.setColumns(10);
 		
 		JLabel lblEmail = new JLabel("Email : ");
 		lblEmail.setBounds(24, 80, 46, 14);
 		frame.getContentPane().add(lblEmail);
 		
 		textField_2 = new JTextField();
 		textField_2.setBounds(162, 80, 86, 20);
 		frame.getContentPane().add(textField_2);
 		textField_2.setColumns(10);
        
 		JLabel lblBdate = new JLabel("B'Date : ");
  		lblBdate.setBounds(24, 110, 46, 14);
  		frame.getContentPane().add(lblBdate);
  		lblBdate.setVisible(input == 1);
  		
  		textField_3 = new JTextField();
  		textField_3.setBounds(162, 110, 86, 20);
  		frame.getContentPane().add(textField_3);
  		textField_3.setColumns(10);
  		textField_3.setVisible(true);
  		
  		
  		JLabel lblLastMeetingDate = new JLabel("Last meeting date : ");
		lblLastMeetingDate.setBounds(24, 140, 152, 14);
		frame.getContentPane().add(lblLastMeetingDate);
		lblLastMeetingDate.setVisible(input == 1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(162, 140, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setVisible(input != 4);
		
		JLabel lblCPI = new JLabel("Common Professional Interests : ");
  		lblCPI.setBounds(24, 110, 200, 14);
  		frame.getContentPane().add(lblCPI);
  		lblCPI.setVisible(input == 4);
  		
  		JLabel lblEvents = new JLabel("Events : ");
  		lblEvents.setBounds(24, 110, 100, 14);
  		frame.getContentPane().add(lblEvents);
  		lblEvents.setVisible(input == 3);
  		
  		JLabel lblDate = new JLabel("Date : ");
  		lblDate.setBounds(24, 140, 45, 14);
		frame.getContentPane().add(lblDate);
		lblDate.setVisible(input == 3);
  		
		JLabel lblContext = new JLabel("Context : ");
		lblContext.setBounds(24, 170, 100, 14);
		frame.getContentPane().add(lblContext);
		lblContext.setVisible(input == 3);
		
		JLabel lblWhereMet = new JLabel("Where Met : ");
		lblWhereMet.setBounds(24, 110, 100, 14);
  		frame.getContentPane().add(lblWhereMet);
  		lblWhereMet.setVisible(input == 2);
  		
  		JLabel lblWhenMet = new JLabel("When Met : ");
  		lblWhenMet.setBounds(24, 140, 100, 14);
		frame.getContentPane().add(lblWhenMet);
		lblWhenMet.setVisible(input == 2);
  		
		JLabel lblOtherInfo = new JLabel("Other Info : ");
		lblOtherInfo.setBounds(24, 170, 150, 14);
		frame.getContentPane().add(lblOtherInfo);
		lblOtherInfo.setVisible(input == 2);
		
		JLabel lblCOM = new JLabel("Meeting Circumstances : ");
		lblCOM.setBounds(24, 200, 200, 14);
		frame.getContentPane().add(lblCOM);
		lblCOM.setVisible(input == 2);
		
		
		textField_5 = new JTextField();
		textField_5.setBounds(162, 170, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		textField_5.setVisible(input == 2 || input == 3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(162, 200, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		textField_6.setVisible(input == 2);
		
		frame.setVisible(true);
  		
  		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(input == 1){
		             Relative A = new Relative();
		             A.SetName( textField.getText() );
						A.SetMobNo( textField_1.getText());
						A.SetEmail( textField_2.getText());
						A.SetBdate( textField_3.getText());
						A.SetLastMeetingDate( textField_4.getText());
						AddAcquaintance(A);
						System.out.println("Relative : " + A.GetName() +" " + A.GetMobNo() + " " +A.GetEmail());
						
		        }
		        if(input == 2){
		        	CasualAcquaintance A = new CasualAcquaintance();
		        		A.SetName( textField.getText() );
						A.SetMobNo( textField_1.getText());
						A.SetEmail( textField_2.getText());
						A.SetWhereMet( textField_3.getText() );
						A.SetWhenMet(textField_4.getText());
						A.SetOtherInfo(textField_5.getText());
						A.SetCircumstancesOfMeeting(textField_6.getText());
						AddAcquaintance(A);
						System.out.println("CasualAcquaintance : " + A.GetName() +" " + A.GetMobNo() + " " +A.GetEmail());
						
						
		        }
		        if(input == 3){
		        	PersonalFriend A = new PersonalFriend();
		        	A.SetName( textField.getText() );
					A.SetMobNo( textField_1.getText());
					A.SetEmail( textField_2.getText());
					A.SetContext(textField_5.getText());
					A.SetDate(textField_4.getText());
					A.SetEvents(textField_3.getText());
					AddAcquaintance(A);

					System.out.println("PersonalFriend : " + A.GetName() +" " + A.GetMobNo() + " " +A.GetEmail());
		        }
		        if(input == 4){
		        	ProfessionalFriend A = new ProfessionalFriend();
		        	A.SetName( textField.getText() );
					A.SetMobNo( textField_1.getText());
					A.SetEmail( textField_2.getText());
					A.SetCommonProfessionalInterests( textField_2.getText() );
					AddAcquaintance(A);
					System.out.println("ProfessionalFriend : " + A.GetName() +" " + A.GetMobNo() + " " +A.GetEmail());
					
		        }
				frame.setVisible(false);
			}
		});
		
		btnSubmit.setBounds(149, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		frame.setVisible(true);
        
            
    }
    
    public void AddAcquaintance(Acquaintance A){
        
        if(no_of_members < max_size){
            list[no_of_members] = A;
            no_of_members++;
        }
        else{
            Acquaintance [] tempList = new Acquaintance[2*max_size];
            int i;
            for(i=0;i<no_of_members;i++) tempList[i] = list[i];
            tempList[no_of_members] = A;
            no_of_members++;
            max_size = 2*max_size;
            list = tempList;
        }
        
    }
    public void DeleteAcquaintance(){
        System.out.println("All acquaintances are : ");
        
		
        final JFrame frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Delete Acquaintance");
		
		JLabel lblAll = new JLabel("All aquaintances are : ");
        lblAll.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblAll.setBounds(40, 17, 313, 24);
		frame.getContentPane().add(lblAll);
		
		JLabel [] label = new JLabel[this.no_of_members];
		for(int i = 0; i < this.no_of_members ; i++){
			label[i] = new JLabel(i + " . " + list[i].GetName());
			label[i].setBounds(31, 62 + 15*i, 100, 14);
			frame.getContentPane().add(label[i]);
		}
		JLabel lblEnterNumber = new JLabel("Enter index number to delete:");
		lblEnterNumber.setBounds(10, 215, 166, 14);
		frame.getContentPane().add(lblEnterNumber);
		
		final JTextField textField = new JTextField();
		textField.setBounds(186, 212, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = Integer.valueOf(textField.getText());
				if(index < 0 || index >= no_of_members){
		            System.out.println("Not possible! Returning to main menu...");
		            return;
		        }
				DeleteAcquaintance(index);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(308, 211, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
		
        
        
    }
    
    public void DeleteAcquaintance(Acquaintance A){
        int i,j;
        for(i = 0; i < no_of_members; i++){
            if(list[i] == A){
                for(j = i+1; j < no_of_members; j++) list[j-1] = list[j];
                list[no_of_members-1] = null;
                no_of_members--;
            }
        }
    }
        public void DeleteAcquaintance(int index){
        int i,j;
                for(j = index+1; j < no_of_members; j++) list[j-1] = list[j];
                list[no_of_members-1] = null;
                no_of_members--;
    }
    
    public void PrintList(){
    	
    	final JFrame frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Printing List");
		
		JLabel lblAll = new JLabel("All aquaintances are : ");
        lblAll.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblAll.setBounds(40, 17, 313, 24);
		frame.getContentPane().add(lblAll);
		
    	JLabel [] label = new JLabel[this.no_of_members];
		for(int i = 0; i < this.no_of_members ; i++){
			
			label[i] = new JLabel(i + " . " + list[i].GetName());
			label[i].setBounds(31, 62 + 15*i, 100, 14);
			frame.getContentPane().add(label[i]);
		}
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(308, 211, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
        
    }
    public void PrintSpecificTypeList(){
        
    	final JFrame frame = new JFrame();
    	frame.setBounds(100, 100, 450, 300);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.getContentPane().setLayout(null);
    	frame.setVisible(true);
		frame.setTitle("Printing specific type");
		
		JLabel lblEnterYourChoice = new JLabel("Enter your choice : ");
		lblEnterYourChoice.setBounds(140, 10, 200, 40);
		lblEnterYourChoice.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(lblEnterYourChoice);
		
		JLabel lblRelative = new JLabel("1. Relative");
		lblRelative.setBounds(20, 42, 74, 14);
		frame.getContentPane().add(lblRelative);
		
		JLabel lblCasualAcquaintance = new JLabel("2. Casual Acquaintance");
		lblCasualAcquaintance.setBounds(20, 62, 153, 14);
		frame.getContentPane().add(lblCasualAcquaintance);
		
		JLabel lblPersonalFriend = new JLabel("3. Personal Friend");
		lblPersonalFriend.setBounds(20, 82, 153, 14);
		frame.getContentPane().add(lblPersonalFriend);
		
		JLabel lblProfessionalFriend = new JLabel("4. Professional Friend");
		lblProfessionalFriend.setBounds(20, 102, 153, 14);
		frame.getContentPane().add(lblProfessionalFriend);
		
		final JTextField textField = new JTextField();
		textField.setBounds(30, 125, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(true);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input = Integer.valueOf(textField.getText());
				if(input <= 0 || input > 4) {
		            System.out.println(input + " is Not possible!! Returning to main menu...");
		            return;
		        }
			     frame.setVisible(false);
			    
			     if(input == 1)PrintList(Relative.class);
			     if(input == 2)PrintList(CasualAcquaintance.class);
			     if(input == 3)PrintList(PersonalFriend.class);
			     if(input == 4)PrintList(ProfessionalFriend.class);
			}
		});
		btnSubmit.setBounds(30, 171, 89, 23);
		frame.getContentPane().add(btnSubmit);
    	
    

    }
        
    public void PrintList(Class<?> myclass){
    	final JFrame frame = new JFrame();
    	frame.setBounds(100, 100, 450, 300);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.getContentPane().setLayout(null);
    	frame.setVisible(true);
    	frame.setTitle("Printing Specific Type");
    	
    	JLabel lblAll = new JLabel("All " + myclass.getName() + "s are : ");
        lblAll.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblAll.setBounds(40, 17, 313, 24);
		frame.getContentPane().add(lblAll);
    	
    	int j = 0;
    	JLabel [] label = new JLabel[this.no_of_members];
		for(int i = 0; i < this.no_of_members ; i++){
			if (myclass == list[i].getClass()) {
			label[j] = new JLabel(j + " . " + list[i].GetName());
			label[j].setBounds(31, 62 + 15*j, 100, 14);
			frame.getContentPane().add(label[j]);
			j++;
			}
		}
		
		
		JButton btnSubmit = new JButton("Done");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			     frame.setVisible(false);
			}
		});
		btnSubmit.setBounds(330, 201, 89, 23);
		frame.getContentPane().add(btnSubmit);
       

    }
    public void SearchByName(){
    	
    	String name ;
    	
    	final JFrame frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Search by name");
		
		JLabel label = new JLabel("SEARCH BY NAME");
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setBounds(59, 11, 233, 31);
		frame.getContentPane().add(label);
		
		JLabel lblEnterName = new JLabel("Enter Name :");
		lblEnterName.setBounds(39, 63, 120, 14);
		frame.getContentPane().add(lblEnterName);
		
		final JTextField textField = new JTextField();
		textField.setBounds(119, 63, 107, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFound = new JLabel("Found!");
		lblFound.setBounds(39, 118, 80, 14);
		frame.getContentPane().add(lblFound);
		lblFound.setVisible(false);
		
		final JLabel lblNotFound = new JLabel("Not Found!");
		lblNotFound.setBounds(95, 118, 67, 14);
		frame.getContentPane().add(lblNotFound);
		lblNotFound.setVisible(false);
		
		final JLabel lblName = new JLabel("name : ");
		lblName.setBounds(39, 148, 80, 14);
		frame.getContentPane().add(lblName);
		lblName.setVisible(false);
		
		final JLabel lblName_1 = new JLabel("NAME");
		lblName_1.setBounds(138, 148, 80, 14);
		frame.getContentPane().add(lblName_1);
		lblName_1.setVisible(false);

		final JLabel lblMobileNumber = new JLabel("Mobile number :");
		lblMobileNumber.setBounds(39, 173, 100, 14);
		frame.getContentPane().add(lblMobileNumber);
		lblMobileNumber.setVisible(false);

		final JLabel lblNumber = new JLabel("NUMBER");
		lblNumber.setBounds(129, 173, 80, 14);
		frame.getContentPane().add(lblNumber);
		lblNumber.setVisible(false);

		final JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setBounds(39, 198, 80, 14);
		frame.getContentPane().add(lblEmail);
		lblEmail.setVisible(false);

		final JLabel lblEmail_1 = new JLabel("EMAIL");
		lblEmail_1.setBounds(129, 198, 80, 14);
		frame.getContentPane().add(lblEmail_1);
		lblEmail_1.setVisible(false);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.setVisible(false);
			}
		});
		btnDone.setBounds(308, 211, 86, 23);
		frame.getContentPane().add(btnDone);
		

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        Acquaintance A = SearchByName(textField.getText());
		        if(A ==  null){
		        	lblNotFound.setVisible(true);
		        	lblName.setVisible(false);
		        	lblName_1.setVisible(false);
		        	lblEmail.setVisible(false);
		        	lblEmail_1.setVisible(false);
		        	lblMobileNumber.setVisible(false);
		        	lblNumber.setVisible(false);
		           return;
		        }
		        else{
		        	lblNotFound.setVisible(false);
		        	lblName.setVisible(true);
		        	lblName_1.setText(A.GetName());
		        	lblName_1.setVisible(true);
		        	lblEmail.setVisible(true);
		        	lblEmail_1.setVisible(true);
		        	lblEmail_1.setText(A.GetEmail());
		        	lblMobileNumber.setVisible(true);
		        	lblNumber.setText(A.GetMobNo());
		        	lblNumber.setVisible(true);
		        }
		      
			}
		});
		btnNewButton.setBounds(254, 63, 86, 20);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
    }
        public Acquaintance SearchByName(String name){
            int i;
            String temp;
            for(i=0;i<no_of_members;i++){
                temp = list[i].GetName();
                if(temp.equals(name)) return list[i];
            }
            return null;
        }
}


public class contact_list 
{
	AcquaintanceList myList;
	public JFrame frame;
	private JPanel MainMenu;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contact_list window = new contact_list();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public contact_list() 
	{
		myList = null;
		File file = new File("vishal.dat");
	    if (file.exists()) {
	            ObjectInputStream objectInputStream = null;
	            try {
	                objectInputStream = new ObjectInputStream(
	                        new FileInputStream("vishal.dat"));
	            } catch (IOException ex) {
	            }
	                try {
	                    myList = (AcquaintanceList) objectInputStream.readObject();
	                    System.out.println("Reading from the file.. now myList : ");
	                } catch (IOException | ClassNotFoundException ex) {
	                }
	                try {
	                    objectInputStream.close();
	                } catch (IOException ex) {
	                                   }

	        }
	        else{
	                    myList = new AcquaintanceList();
	                    System.out.println("File does not exist ..Creating new myList : ");
	        }
	        
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setTitle("Main Menu");
		main_menu();
		
	}
	
	public void main_menu(){
		
		MainMenu = new JPanel();
		frame.getContentPane().add(MainMenu, "name_1120748555844013");
		MainMenu.setLayout(null);
		MainMenu.setVisible(true);
		
		JLabel lblWelcomeToAcquaintance = new JLabel("Welcome to Acquaintance Software! ");
		lblWelcomeToAcquaintance.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWelcomeToAcquaintance.setBounds(71, 29, 332, 14);
		MainMenu.add(lblWelcomeToAcquaintance);
		
		JLabel lblClickOnAny = new JLabel("Click on any one of these buttons : ");
		lblClickOnAny.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblClickOnAny.setBounds(90, 60, 313, 24);
		MainMenu.add(lblClickOnAny);
		
		JButton btnCreateAcquaintance = new JButton("Create Acquaintance");
		btnCreateAcquaintance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu.setVisible(false);
				myList.CreateAcquaintance();
				myList.SaveEverything();
				MainMenu.setVisible(true);
			}
		});
		btnCreateAcquaintance.setBounds(59, 104, 160, 23);
		MainMenu.add(btnCreateAcquaintance);
		
		JButton btnDeleteAcquaintance = new JButton("Delete Acquaintance");
		btnDeleteAcquaintance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu.setVisible(false);
				myList.DeleteAcquaintance();
				myList.SaveEverything();
				MainMenu.setVisible(true);
			}
		});
		btnDeleteAcquaintance.setBounds(59, 140, 160, 23);
		MainMenu.add(btnDeleteAcquaintance);
		
		JButton btnPrintlist = new JButton("Print List");
		btnPrintlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu.setVisible(false);
				myList.PrintList();
				myList.SaveEverything();
				MainMenu.setVisible(true);
			}
		});
		btnPrintlist.setBounds(59, 174, 160, 23);
		MainMenu.add(btnPrintlist);
		
		JButton btnPrintspecifictypelist = new JButton("Print Specific Type List");
		btnPrintspecifictypelist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu.setVisible(false);
				myList.PrintSpecificTypeList();
				myList.SaveEverything();
				MainMenu.setVisible(true);
			}
		});
		
		btnPrintspecifictypelist.setBounds(252, 140, 160, 23);
		MainMenu.add(btnPrintspecifictypelist);
		
		JButton btnSearchbyname = new JButton("Search By Name");
		btnSearchbyname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu.setVisible(false);
				myList.SearchByName();
				myList.SaveEverything();
				MainMenu.setVisible(true);
			}
		});
		btnSearchbyname.setBounds(252, 104, 160, 23);
		MainMenu.add(btnSearchbyname);
			
	}
}



