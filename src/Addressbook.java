/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author mahbubnirjon
 */
public class Addressbook extends javax.swing.JFrame {

    /**
     * Creates new form Addressbook
     */
    public Addressbook() {
        initComponents();
        if(file.exists()&&(file.length()!=0)){
            try {
                reader = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            while (reader.hasNext()){
                String n = reader.nextLine();
                String[] temp  = n.split("~");
                address.add(new Person(temp[0],temp[1],temp[2],temp[3]));

            }
            reader.close();
            try {
                writer = new BufferedWriter(new FileWriter(file,false));
                for (Person p:address) {
                    writer.append(p.getName()+"~");
                    writer.append(p.getPhone()+"~");
                    writer.append(p.getEmail()+"~");
                    writer.append(p.getAddress()+"\n");
                    writer.flush();}
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        else{
            try {
                writer = new BufferedWriter(new FileWriter(file,false));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        nameTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        emailTextPane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        phoneTextPane = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        addressTextPane = new javax.swing.JTextPane();
        searchButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        searchByNameTextPane = new javax.swing.JTextPane();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        searchByPhoneTextPane = new javax.swing.JTextPane();
        viewButton = new javax.swing.JButton();
        searchButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adress Book");

        nameTextPane.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(nameTextPane);

        jScrollPane3.setViewportView(emailTextPane);

        jScrollPane4.setViewportView(phoneTextPane);

        jScrollPane5.setViewportView(addressTextPane);

        searchButton.setBackground(new java.awt.Color(102, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(102, 255, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(searchByNameTextPane);

        editButton.setBackground(new java.awt.Color(102, 255, 255));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jextArea.setColumns(20);
        jextArea.setRows(5);
        jScrollPane1.setViewportView(jextArea);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Name        :");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Email        :");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Phone       :");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setText("Address    :");

        jScrollPane7.setViewportView(searchByPhoneTextPane);

        viewButton.setBackground(new java.awt.Color(102, 255, 255));
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        searchButton1.setBackground(new java.awt.Color(102, 255, 255));
        searchButton1.setText("Search");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Name");

        jLabel6.setText("Enter Phone Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGap(15, 15, 15)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addGap(12, 12, 12)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(2, 2, 2)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(3, 3, 3)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                                                .addComponent(jScrollPane2)
                                                                .addComponent(jScrollPane3)
                                                                .addComponent(jScrollPane5))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(45, 45, 45)
                                                                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(searchButton)
                                                                        .addGap(28, 28, 28)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(searchButton1))
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(3, 3, 3))
                                                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (searchByNameTextPane.getText()!= "") {
            for (int i = 0; i < address.size(); i++) {
                if (address.get(i).getName().equalsIgnoreCase(searchByNameTextPane.getText())){
                    index=i;
                    break;
                }
            }
        }
        if (index==-1){
            jextArea.setText("Not Found");
        }else{
            jextArea.setText("");
            nameTextPane.setText(address.get(index).getName());
            phoneTextPane.setText(address.get(index).getPhone());
            emailTextPane.setText(address.get(index).getEmail());
            addressTextPane.setText(address.get(index).getAddress());
            jextArea.append(address.get(index).getName()+"\n");
            jextArea.append(address.get(index).getPhone()+"\n");
            jextArea.append(address.get(index).getEmail()+"\n");
            jextArea.append(address.get(index).getAddress()+"\n");
        }
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        address.add(new Person(nameTextPane.getText(),
                phoneTextPane.getText().substring(1),
                emailTextPane.getText(),
                addressTextPane.getText()));
        try {
            writer.append(nameTextPane.getText()+"~");
            writer.append(phoneTextPane.getText().substring(1)+"~");
            writer.append(emailTextPane.getText()+"~");
            writer.append(addressTextPane.getText()+"\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        nameTextPane.setText("");
        phoneTextPane.setText("");
        emailTextPane.setText("");
        addressTextPane.setText("");
    }

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (index==-1){jextArea.setText("Search Something");}else{
            address.set(index, new Person(nameTextPane.getText()
                    ,phoneTextPane.getText().substring(1),emailTextPane.getText(),addressTextPane.getText()));
            try {try {file = new File("data.txt");
                    writer = new BufferedWriter(new FileWriter(file,false));
                } catch (IOException e) {throw new RuntimeException(e);}
                for (Person p:address) {
                    writer.append(p.getName()+"~");
                    writer.append(p.getPhone()+"~");
                    writer.append(p.getEmail()+"~");
                    writer.append(p.getAddress()+"\n");
                    writer.flush();}
                jextArea.setText("Edited");
                nameTextPane.setText("");
                phoneTextPane.setText("");
                emailTextPane.setText("");
                addressTextPane.setText("");} catch (IOException e) {throw new RuntimeException(e);}}}

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jextArea.setText("");
        address.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        if (address.size()!=0){
            for (Person p:address) {
                jextArea.append("Name = "+p.getName()+"\n");
                jextArea.append("Phone = "+"0"+p.getPhone()+"\n");
                jextArea.append("Email = "+p.getEmail()+"\n");
                jextArea.append("Address = "+p.getAddress()+"\n");
                jextArea.append("\n");
            }
        }
        else {
            jextArea.setText("Nothing Found");
        }
    }

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (searchByPhoneTextPane.getText()!= "") {
            for (int i = 0; i < address.size(); i++) {
                long a=Long.valueOf(address.get(i).getPhone());
                long b=Long.valueOf(searchByPhoneTextPane.getText().substring(1));
                if (Long.compare(a,b)==0)index=i;
                    break;
            }
        }else {
            jextArea.setText("Enter A Phone Number");
        }
        if (index==-1){jextArea.setText("Not Found");}else{
            jextArea.setText("");
            nameTextPane.setText(address.get(index).getName());
            phoneTextPane.setText("0"+address.get(index).getPhone());
            emailTextPane.setText(address.get(index).getEmail());
            addressTextPane.setText(address.get(index).getAddress());
            jextArea.append(address.get(index).getName()+"\n");
            jextArea.append(address.get(index).getEmail()+"\n");
            jextArea.append("0"+address.get(index).getPhone()+"\n");
            jextArea.append(address.get(index).getAddress()+"\n");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Addressbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addressbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addressbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addressbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addressbook().setVisible(true);
            }
        });
    }

    ArrayList<Person> address =new ArrayList<>();
    private File file = new File("data.txt");
    private BufferedWriter writer;
    private Scanner reader;
    int index=-1 ;





    // Variables declaration - do not modify
    private javax.swing.JTextPane addressTextPane;
    private javax.swing.JButton editButton;
    private javax.swing.JTextPane emailTextPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jextArea;
    private javax.swing.JTextPane nameTextPane;
    private javax.swing.JTextPane phoneTextPane;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton1;
    private javax.swing.JTextPane searchByNameTextPane;
    private javax.swing.JTextPane searchByPhoneTextPane;
    private javax.swing.JButton viewButton;
    // End of variables declaration
}
