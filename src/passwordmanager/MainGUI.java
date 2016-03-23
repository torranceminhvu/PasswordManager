/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Minh
 */
public class MainGUI extends javax.swing.JFrame {

    private ListOfWebsites list;
    private DefaultTableModel model;

    /**
     * Creates new form MainGUI
     *
     * @param l
     */
    public MainGUI(ListOfWebsites l) {
        initComponents();
        list = l;
        listAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        urlLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        urlText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        listAllButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutText = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        aboutText1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        urlLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urlLabel.setText("URL");
        urlLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Username");
        usernameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password");
        passwordLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        insertButton.setText("Insert");
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        tableScrollPane.setToolTipText("");

        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }};
            model.setColumnIdentifiers(new String[] {"URL", "USERNAME", "PASSWORD"});
            jTable1.setModel(model);
            tableScrollPane.setViewportView(jTable1);

            clearButton.setText("Clear");
            clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    clearButtonMouseClicked(evt);
                }
            });

            searchButton.setText("Search");
            searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    searchButtonMouseClicked(evt);
                }
            });

            listAllButton.setText("List All");
            listAllButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    listAllButtonMouseClicked(evt);
                }
            });

            aboutText.setEditable(false);
            aboutText.setText("Password Manager");
            jScrollPane1.setViewportView(aboutText);

            aboutText1.setEditable(false);
            aboutText1.setText("By: Minh Vu");
            jScrollPane2.setViewportView(aboutText1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordText)
                        .addComponent(urlText)
                        .addComponent(urlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(usernameText)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(listAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(urlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(urlText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(insertButton)
                                .addComponent(deleteButton))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(updateButton)
                                .addComponent(clearButton))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchButton)
                                .addComponent(listAllButton))
                            .addGap(38, 38, 38)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        try {
            String URL = urlText.getText();
            String username = usernameText.getText();
            String password = passwordText.getText();
            
            list.insert(URL, username, password);
            /*
            if (check == true) {
                JOptionPane.showMessageDialog(null, "Insert Success!");
            } else {
                JOptionPane.showMessageDialog(null, "Failure, Duplicate Insert!");
            }*/
            urlText.setText("");
            usernameText.setText("");
            passwordText.setText("");
            save();
            listAll(); 
            
            
        } catch (IOException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_insertButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        try {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                list.clear();
                listAll();
                JOptionPane.showMessageDialog(null, "Cleared");
                save();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        try {
            boolean check = list.delete(urlText.getText());
            if (check == false) {
                JOptionPane.showMessageDialog(null, "URL could not be found!");
            } else {
                JOptionPane.showMessageDialog(null, "Delete Success!");
            }
            urlText.setText("");
            usernameText.setText("");
            passwordText.setText("");
            listAll();
            save();
        } catch (IOException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        try {
            String URL = urlText.getText();
            String username = usernameText.getText();
            String password = passwordText.getText();
            if (!urlText.getText().equals("")) {
                Website w = list.update(URL, username, password);
                if (w == null) {
                    JOptionPane.showMessageDialog(null, "URL could not be found!");
                } else {
                    JOptionPane.showMessageDialog(null, "Update Success!");
                }
                urlText.setText("");
                usernameText.setText("");
                passwordText.setText("");
                listAll();
                save();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        Website w;
        
        if (!urlText.getText().equals("")) {
           w = list.search(urlText.getText());
           if (w == null) {
                JOptionPane.showMessageDialog(null, "URL could not be found!");
                listAll();
           } else {
                JOptionPane.showMessageDialog(null, "Search Success!");
                model.setRowCount(0);
                model.addRow(new String[]{w.getUrl(), w.getUsername(), w.getPassword()});
                urlText.setText(""); 
           }      
        }
        
    }//GEN-LAST:event_searchButtonMouseClicked

    private void listAllButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAllButtonMouseClicked
        try {
            listAll();
            save();
        } catch (IOException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listAllButtonMouseClicked

    private void listAll() {
        model.setRowCount(0);
        for (Website w : list.getList()) {
            model.addRow(new String[]{w.getUrl(), w.getUsername(), w.getPassword()});
        }
    }

    private void save() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("database.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException i) {
            i.printStackTrace(System.out);
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {

        ListOfWebsites list;

        File f = new File("database.ser");
        // if successfully created
        if (f.createNewFile()) {
            list = new ListOfWebsites();
            try {
                FileOutputStream fos = new FileOutputStream("database.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            } catch (IOException i) {
                i.printStackTrace(System.out);
            }
        } // file already exists
        else {
            try {
                FileInputStream fis = new FileInputStream("database.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                list = (ListOfWebsites) ois.readObject();

                ois.close();
                fis.close();
            } catch (IOException | ClassNotFoundException i) {
                i.printStackTrace(System.out);
                return;
            }
        }
        
        JLabel jPassword = new JLabel ("Password: ");
        JTextField password = new JPasswordField();
        Object[] ob = {jPassword, password};
        int result = JOptionPane.showConfirmDialog(null, ob, "Password?", JOptionPane.OK_CANCEL_OPTION);
        
        if (result == JOptionPane.OK_OPTION) {
            String answer = password.getText();
            if (answer.equals("password")) {
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainGUI(list).setVisible(true);
                }
            });
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Password, please try again!");
            }
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane aboutText;
    private javax.swing.JTextPane aboutText1;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton listAllButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JButton searchButton;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlText;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
