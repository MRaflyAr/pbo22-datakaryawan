package view.admin;
import java.lang.Integer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import java.awt.*;

import controller.KaryawanTetapController;
import controller.KaryawanKontrakController;
import controller.View_Controller;

public class DashBoardCRUD extends JFrame {
    int row;

    KaryawanKontrakController _KaryawanKontrakA=new KaryawanKontrakController();
    KaryawanTetapController _KaryawanTetap=new KaryawanTetapController();

    final private Font mainFontLabel = new Font("Times New Roman",Font.BOLD,24);
    final private Font mainFontSmallLabel=new Font("Times New Roman",Font.BOLD,14);
    final private Font mainFontButton=new Font("Times New Roman",Font.BOLD,9);
    
    JLabel lblShowTable,lblKaryawanKontrak,lblKaryawanTetap;
    JTable tableKTetap=new JTable();
    JTable tableKKontrak=new JTable();
    JScrollPane scrollPaneKTetap=new JScrollPane(tableKTetap);
    JScrollPane scrollPaneKKontrak=new JScrollPane(tableKKontrak);

    JPanel pnlKiri;
    JLabel lblAdmin,lblNameKTetap,lblNameKKontrak,lblKelaminKTetap,lblKelaminKKontrak,
    lblGajiKTetap,lblGajiKKontrak,lblAgeKTetap,lblTipeKKontrak,lblKaryawanTetapLeft,lblKaryawanKontrakLeft;
    JTextField tfNameKTetap,tfNameKKontrak,tfKelaminKTetap,tfKelaminKKontrak,tfGajiKTetap,
    tfGajiKKontrak,tfTipeKKontrak,tfAgeKTetap;
    JButton btnSaveKTetap,btnSaveKKontrak,btnUpdateKTetap,btnUpdateKKontrak,
    btnDeleteKTetap,btnDeleteKKontrak,btnClearAll,btnBacktoLogin;
    JComboBox boxKelaminKTetap,boxKelaminKKontrak,boxKelaminKTipe;
  
    public DashBoardCRUD()
    {
        setTitle("Register");
        setSize(840,490);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray);
        panelKiri();
        panelKanan();
        setVisible(true);
    }

    public void panelKanan()
    {
        //label
        lblShowTable=new JLabel("KARYAWAN");
        lblShowTable.setBounds(480,10,200,50);
        lblShowTable.setForeground(Color.darkGray);
        lblShowTable.setFont(mainFontLabel);

        lblKaryawanTetap=new JLabel("TETAP");
        lblKaryawanTetap.setBounds( 595,70,250,50);
        lblKaryawanTetap.setForeground(Color.darkGray);
        lblKaryawanTetap.setFont(mainFontLabel);
       
        lblKaryawanKontrak=new JLabel("KONTRAK");
        lblKaryawanKontrak.setBounds(327,70,250,50);
        lblKaryawanKontrak.setForeground(Color.DARK_GRAY);
        lblKaryawanKontrak.setFont(mainFontLabel);


        //Tabel
        scrollPaneKTetap.setBounds(570,120,230,320);
        tableKTetap.setModel(listKaryawanTetap());
        tableKTetap.addMouseListener(new MouseInputListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
            int index=tableKTetap.getSelectedRow();
            row=index;
            tfNameKTetap.setText(listKaryawanTetap().getValueAt(index, 0).toString());
            tfKelaminKTetap.setText(listKaryawanTetap().getValueAt(index, 1).toString());
            tfGajiKTetap.setText(listKaryawanTetap().getValueAt(index, 2).toString());
            tfAgeKTetap.setText(listKaryawanTetap().getValueAt(index, 3).toString());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stubss
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
              
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

        });
       
        scrollPaneKKontrak.setBounds(  315, 120, 230, 320);
        tableKKontrak.setModel(listKaryawanKontrak());
        tableKKontrak.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int index=tableKKontrak.getSelectedRow();
                row=index;
                tfNameKKontrak.setText(listKaryawanKontrak().getValueAt(index, 0).toString());
                tfKelaminKKontrak.setText(listKaryawanKontrak().getValueAt(index, 1).toString());
                tfGajiKKontrak.setText(listKaryawanKontrak().getValueAt(index, 2).toString());
                tfTipeKKontrak.setText(listKaryawanKontrak().getValueAt(index, 3).toString());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
      
        add(scrollPaneKKontrak);
        add(scrollPaneKTetap);
        add(lblKaryawanKontrak);
        add(lblShowTable);
        add(lblKaryawanTetap);
    }

    private DefaultTableModel listKaryawanKontrak()
    {
        DefaultTableModel modelKaryawanKontrak=new DefaultTableModel();
        Object[] colum={"Nama","Kelamin","Gaji","Tipe"};
        modelKaryawanKontrak.setColumnIdentifiers(colum);
        for (int i=0;i<_KaryawanKontrakA.read().size();i++){
            Object[] inColum=new Object[4];
            inColum[0] = _KaryawanKontrakA.read().get(i).getKaryawanName();
            inColum[1] = _KaryawanKontrakA.read().get(i).getKaryawanGen();
            inColum[2] = _KaryawanKontrakA.read().get(i).getGajiKaryawan();
            inColum[3] = _KaryawanKontrakA.read().get(i).getKaryawanTipe();
            modelKaryawanKontrak.addRow(inColum);
        }
        return modelKaryawanKontrak;
    }

    public DefaultTableModel listKaryawanTetap()
    {
        DefaultTableModel modelKaryawanTetap=new DefaultTableModel();
        Object[] colum={"Name","Kelamin","Gaji","Umur"};
        modelKaryawanTetap.setColumnIdentifiers(colum);
        for (int i=0;i<_KaryawanTetap.read().size();i++){
            Object[] inColum=new Object[4];
            inColum[0] =_KaryawanTetap.read().get(i).getKaryawanName();
            inColum[1] = _KaryawanTetap.read().get(i).getKaryawanGen();
            inColum[2] = _KaryawanTetap.read().get(i).getGajiKaryawan();
            inColum[3] = _KaryawanTetap.read().get(i).getKaryawanAge();
            modelKaryawanTetap.addRow(inColum);
        }
        return modelKaryawanTetap;
    }
    

    public void panelKiri()
    {
        //panel
        pnlKiri=new JPanel();
        pnlKiri.setBounds(0,0,290,490);
        pnlKiri.setBackground(Color.DARK_GRAY);
        pnlKiri.setLayout(null);

        //label
        lblAdmin=new JLabel("KARYAWAN");
        lblAdmin.setBounds(95, 10, 100, 50);
        lblAdmin.setForeground(Color.lightGray);
        lblAdmin.setFont(mainFontLabel);

        lblKaryawanTetapLeft=new JLabel("Tetap");
        lblKaryawanTetapLeft.setBounds(190,50, 100, 50);
        lblKaryawanTetapLeft.setFont(mainFontSmallLabel);
        lblKaryawanTetapLeft.setForeground(Color.lightGray);

        lblKaryawanKontrakLeft=new JLabel("Kontrak");
        lblKaryawanKontrakLeft.setBounds(10, 50, 100, 50);
        lblKaryawanKontrakLeft.setFont(mainFontSmallLabel);
        lblKaryawanKontrakLeft.setForeground(Color.lightGray);

        lblNameKTetap=new JLabel("Nama");
        lblNameKTetap.setBounds(180,70, 90, 50);
        lblNameKTetap.setFont(mainFontSmallLabel);
        lblNameKTetap.setForeground(Color.lightGray);
        
        lblNameKKontrak=new JLabel("Nama");
        lblNameKKontrak.setBounds(10,70, 90, 50);
        lblNameKKontrak.setFont(mainFontSmallLabel);
        lblNameKKontrak.setForeground(Color.lightGray);
        
        lblKelaminKTetap=new JLabel("Kelaamin");
        lblKelaminKTetap.setBounds( 180,120, 100, 50);
        lblKelaminKTetap.setFont(mainFontSmallLabel);
        lblKelaminKTetap.setForeground(Color.lightGray);
     
        lblKelaminKKontrak=new JLabel("Kelamin");
        lblKelaminKKontrak.setBounds(10,120, 100, 50);
        lblKelaminKKontrak.setFont(mainFontSmallLabel);
        lblKelaminKKontrak.setForeground(Color.lightGray);

        lblGajiKTetap=new JLabel("Gaji");
        lblGajiKTetap.setBounds(180,170, 100, 50);
        lblGajiKTetap.setFont(mainFontSmallLabel);
        lblGajiKTetap.setForeground(Color.lightGray);
       
        lblGajiKKontrak=new JLabel("Gaji");
        lblGajiKKontrak.setBounds( 10,170, 100, 50);
        lblGajiKKontrak.setFont(mainFontSmallLabel);
        lblGajiKKontrak.setForeground(Color.lightGray);

       
        lblTipeKKontrak=new JLabel("Tipe");
        lblTipeKKontrak.setBounds(10,220, 100, 50);
        lblTipeKKontrak.setFont(mainFontSmallLabel);
        lblTipeKKontrak.setForeground(Color.lightGray);

        
        lblAgeKTetap=new JLabel("Umur");
        lblAgeKTetap.setBounds(180,220, 100, 50);
        lblAgeKTetap.setFont(mainFontSmallLabel);
        lblAgeKTetap.setForeground(Color.lightGray);

        //txtfield
        tfNameKTetap=new JTextField();
        tfNameKTetap.setBounds(180, 110, 100, 20);
        tfNameKTetap.setFont(mainFontSmallLabel);
       
        tfNameKKontrak=new JTextField();
        tfNameKKontrak.setBounds( 10, 110, 100, 20);
        tfNameKKontrak.setFont(mainFontSmallLabel);

        tfKelaminKTetap=new JTextField();
        tfKelaminKTetap.setBounds( 230, 160, 50, 20);
        tfKelaminKTetap.setFont(mainFontSmallLabel);
     
        tfKelaminKKontrak=new JTextField();
        tfKelaminKKontrak.setBounds(60, 160, 50, 20);
        tfKelaminKKontrak.setFont(mainFontSmallLabel);
    
        tfGajiKTetap=new JTextField();
        tfGajiKTetap.setBounds(180, 210, 100, 20);
        tfGajiKTetap.setFont(mainFontSmallLabel);

        tfGajiKKontrak=new JTextField();
        tfGajiKKontrak.setBounds(    10, 210, 100, 20);
        tfGajiKKontrak.setFont(mainFontSmallLabel);

        tfTipeKKontrak=new JTextField();
        tfTipeKKontrak.setBounds(60, 260, 50, 20);
        tfTipeKKontrak.setFont(mainFontSmallLabel);

        tfAgeKTetap=new JTextField();
        tfAgeKTetap.setBounds(180, 260, 100, 20);
        tfAgeKTetap.setFont(mainFontSmallLabel);

        //box
        String[] Kelamin={
            "Pria","Wanita"
        };
        boxKelaminKTetap=new JComboBox<>(Kelamin);
        boxKelaminKTetap.setFont(mainFontSmallLabel);
        boxKelaminKTetap.setBounds( 180, 160, 50, 20);

        boxKelaminKTetap.addActionListener((e)->{
            if (e.getSource()==boxKelaminKTetap){
                String selectKelamin=boxKelaminKTetap.getSelectedItem().toString();
                tfKelaminKTetap.setText(selectKelamin);
            }
        });
       
        boxKelaminKKontrak=new JComboBox<>(Kelamin);
        boxKelaminKKontrak.setFont(mainFontSmallLabel);
        boxKelaminKKontrak.setBounds(10, 160, 50, 20);
        boxKelaminKKontrak.addActionListener((e)->{
            if (e.getSource()==boxKelaminKKontrak){
                String selectKelamin=boxKelaminKKontrak.getSelectedItem().toString();
                tfKelaminKKontrak.setText(selectKelamin);
            }
        });

        String[] tipe={
            "Magang","3 Tahun","5 Tahun"
        };
        boxKelaminKTipe=new JComboBox<>(tipe);
        boxKelaminKTipe.setFont(mainFontSmallLabel);
        boxKelaminKTipe.setBounds(10, 260, 50, 20);
        boxKelaminKTipe.addActionListener((e)->{
            if (e.getSource()==boxKelaminKTipe){
                String selectTipe=boxKelaminKTipe.getSelectedItem().toString();
                tfTipeKKontrak.setText(selectTipe);
            }
        });

    
        //button Shoes Hiking
        btnSaveKTetap=new JButton("Tambah");
        btnSaveKTetap.setBounds(180, 300, 100, 20);
        btnSaveKTetap.setFont(mainFontButton);
        btnSaveKTetap.setBackground(Color.LIGHT_GRAY);
        btnSaveKTetap.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    String KName=tfNameKTetap.getText();
                    String KKelamin=tfKelaminKTetap.getText();
                    int KGaji=Integer.valueOf(tfGajiKTetap.getText());
                    int KAge=Integer.valueOf(tfAgeKTetap.getText());
                    _KaryawanTetap.create(KName, KKelamin, KGaji, KAge);
                    tableKTetap.setModel((listKaryawanTetap()));
                } catch (NumberFormatException ea) {
                    JOptionPane.showMessageDialog(null,"Ada Yang Salah !","Information", JOptionPane.ERROR_MESSAGE);
                } 
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               btnSaveKTetap.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSaveKTetap.setBackground(Color.LIGHT_GRAY);
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
     
        btnUpdateKTetap=new JButton("UBAH");
        btnUpdateKTetap.setBounds(180, 330, 100, 20);
        btnUpdateKTetap.setFont(mainFontButton);
        btnUpdateKTetap.setBackground(Color.lightGray);
        btnUpdateKTetap.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
              try {
                String KName=tfNameKTetap.getText();
                String KKelamin=tfKelaminKTetap.getText();
                int KGaji=Integer.valueOf(tfGajiKTetap.getText());
                int KAge=Integer.valueOf(tfAgeKTetap.getText());
                _KaryawanTetap.update(row, KName, KKelamin, KGaji, KAge);
                tableKTetap.setModel((listKaryawanTetap()));
              } catch (Exception ea) {
                JOptionPane.showMessageDialog(null,"Ada Yang Salah !","Information", JOptionPane.ERROR_MESSAGE);
              }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               btnUpdateKTetap.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnUpdateKTetap.setBackground(Color.lightGray);
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });

        btnDeleteKTetap=new JButton("HAPUS");
        btnDeleteKTetap.setBounds( 180, 360, 100, 20);
        btnDeleteKTetap.setFont(mainFontButton);
        btnDeleteKTetap.setBackground(Color.LIGHT_GRAY);
        btnDeleteKTetap.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    _KaryawanTetap.delete(row);
                    JOptionPane.showMessageDialog(null,"Hapus Karyawan Tetap Berhasil","Information", JOptionPane.INFORMATION_MESSAGE);
                    tableKTetap.setModel((listKaryawanTetap()));
                } catch (Exception ea) {
                    JOptionPane.showMessageDialog(null,"Ada Yang Salah !","Information", JOptionPane.ERROR_MESSAGE);
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnDeleteKTetap.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDeleteKTetap.setBackground(Color.LIGHT_GRAY);
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });

        //button Shoes Walking
        btnSaveKKontrak=new JButton("TAMBAH");
        btnSaveKKontrak.setBounds( 10, 300, 100, 20);
        btnSaveKKontrak.setFont(mainFontButton);
        btnSaveKKontrak.setBackground(Color.lightGray);
        btnSaveKKontrak.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    String KName=tfNameKKontrak.getText();
                    String KKelamin=tfKelaminKKontrak.getText();
                    int KGaji=Integer.valueOf(tfGajiKKontrak.getText());
                    String KTipe=tfTipeKKontrak.getText();
                    _KaryawanKontrakA.create(KName, KKelamin, KGaji, KTipe);
                    tableKKontrak.setModel((listKaryawanKontrak()));

                }catch(Exception ea)
                {
                    JOptionPane.showMessageDialog(null,"Ada Yang Salah !","Information", JOptionPane.ERROR_MESSAGE);
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSaveKKontrak.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSaveKKontrak.setBackground(Color.lightGray);
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
        
        btnUpdateKKontrak=new JButton("UBAH");
        btnUpdateKKontrak.setBounds( 10, 330, 100, 20);
        btnUpdateKKontrak.setFont(mainFontButton);
        btnUpdateKKontrak.setBackground(Color.LIGHT_GRAY);
        btnUpdateKKontrak.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    String KName=tfNameKKontrak.getText();
                    String KKelamin=tfKelaminKKontrak.getText();
                    int KGaji=Integer.valueOf(tfGajiKKontrak.getText());
                    String KTipe=tfTipeKKontrak.getText();
                    _KaryawanKontrakA.update(row, KName, KKelamin, KGaji, KTipe);
                    tableKKontrak.setModel((listKaryawanKontrak()));
                } catch (Exception ea) {
                    JOptionPane.showMessageDialog(null,"Ada Yang Salah !","Information", JOptionPane.ERROR_MESSAGE);
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnUpdateKKontrak.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnUpdateKKontrak.setBackground(Color.LIGHT_GRAY);
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
       
        btnDeleteKKontrak=new JButton("HAPUS");
        btnDeleteKKontrak.setBounds( 10, 360, 100, 20);
        btnDeleteKKontrak.setFont(mainFontButton);
        btnDeleteKKontrak.setBackground(Color.lightGray);
        btnDeleteKKontrak.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            try {
                _KaryawanKontrakA.delete(row);
                JOptionPane.showMessageDialog(null,"Hapus Karyawan Kontrak Berhasil","Information", JOptionPane.INFORMATION_MESSAGE);
                tableKKontrak.setModel((listKaryawanKontrak()));
            } catch (Exception ea) {
                JOptionPane.showMessageDialog(null,"Ada Yang Salah !","Information", JOptionPane.ERROR_MESSAGE);
            }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnDeleteKKontrak.setBackground(Color.gray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDeleteKKontrak.setBackground(Color.lightGray);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });

        btnClearAll=new JButton("BERSIH");
        btnClearAll.setFont(mainFontButton);
        btnClearAll.setBackground(Color.lightGray);
        btnClearAll.setBounds(95,390, 100, 20);
        btnClearAll.addActionListener((e)->{

            tfTipeKKontrak.setText("");
            tfAgeKTetap.setText("");
            tfGajiKTetap.setText("");
            tfGajiKKontrak.setText("");
            tfKelaminKTetap.setText("");
            tfKelaminKKontrak.setText("");
            tfNameKTetap.setText("");
            tfNameKKontrak.setText("");
        });

        btnBacktoLogin=new JButton("back");
        btnBacktoLogin.setFont(mainFontButton);
        btnBacktoLogin.setBackground(Color.lightGray);
        btnBacktoLogin.setBounds(10,10,40,20);
        btnBacktoLogin.addActionListener((e)->{
            new View_Controller().toLogin();
            setVisible(false);
        }); 
        //addbutton
        pnlKiri.add(btnBacktoLogin);
        pnlKiri.add(btnClearAll);
        pnlKiri.add(btnSaveKKontrak);
        pnlKiri.add(btnUpdateKKontrak);
        pnlKiri.add(btnDeleteKKontrak);
        pnlKiri.add(btnDeleteKTetap);
        pnlKiri.add(btnUpdateKTetap);
        pnlKiri.add(btnSaveKTetap);


        //addComboBox
        pnlKiri.add(boxKelaminKTipe);
        pnlKiri.add(boxKelaminKKontrak);
        pnlKiri.add(boxKelaminKTetap);

        //addTextField
        pnlKiri.add(tfTipeKKontrak);
        pnlKiri.add(tfAgeKTetap);
        pnlKiri.add(tfGajiKTetap);
        pnlKiri.add(tfGajiKKontrak);
        pnlKiri.add(tfKelaminKKontrak);
        pnlKiri.add(tfKelaminKTetap);
        pnlKiri.add(tfNameKKontrak);
        pnlKiri.add(tfNameKTetap);

        //addLabel
        pnlKiri.add(lblAgeKTetap);
        pnlKiri.add(lblTipeKKontrak);
        pnlKiri.add(lblGajiKKontrak);
        pnlKiri.add(lblGajiKTetap);
        pnlKiri.add(lblKelaminKKontrak);
        pnlKiri.add(lblKelaminKTetap);
        pnlKiri.add(lblNameKKontrak);
        pnlKiri.add(lblNameKTetap);
        pnlKiri.add(lblAdmin);
        pnlKiri.add(lblKaryawanTetapLeft);
        pnlKiri.add(lblKaryawanKontrakLeft);

        //addPanel
        add(pnlKiri);
    }
}
