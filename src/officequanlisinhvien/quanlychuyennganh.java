/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package officequanlisinhvien;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MANH TRUONG
 */
public class quanlychuyennganh extends javax.swing.JPanel {
    DefaultTableModel tblModel;
    /**
     * Creates new form quanlychuyennganh
     */
    public quanlychuyennganh() {
        initComponents();
        initTable();
        loadDulieu();
    }
    private void initTable(){
        tblModel=new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã Ngành","Tên Ngành"});//thiết lập tên của của các table
        tbldulieu.setModel(tblModel);//thiết lập model cho table
    } 
    private void loadDulieu(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=quanlysinhvien";
            String username="sa";
            String password="123456789";
            
            Connection con =DriverManager.getConnection(url, username, password);
            String sql="select*from chuyennganh";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();//trả về kết quả ResultSet
            tblModel.setRowCount(0);
            while(rs.next()){
               String[] row=new String[]{
                   rs.getString("manganh"),rs.getString("tennganh")
               };
               tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();//cập nhật dữ liệu trong bảng
            rs.close();//đóng kết nối lại 
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
           
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldulieu = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtTenNganh = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnNhapmoi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaNganh = new javax.swing.JTextField();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("QUẢN LÝ CHUYÊN NGÀNH");

        tbldulieu.setBackground(new java.awt.Color(0, 255, 0));
        tbldulieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbldulieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbldulieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbldulieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldulieuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbldulieu);

        jScrollPane1.setViewportView(jScrollPane2);

        txtTenNganh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenNganh.setForeground(new java.awt.Color(0, 0, 255));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 0, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 0, 255));
        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(0, 0, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnNhapmoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhapmoi.setForeground(new java.awt.Color(0, 0, 255));
        btnNhapmoi.setText("Nhập Mới");
        btnNhapmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapmoiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Mã Ngành:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Tên Ngành:");

        txtMaNganh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaNganh.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNhapmoi)
                .addGap(243, 243, 243))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtMaNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhapmoi)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(txtMaNganh.getText().equals("")||txtTenNganh.getText().equals("")){
            JOptionPane.showMessageDialog(this,"cần nhập đủ thông tin");
            return;
        }
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=quanlysinhvien";
            String username="sa";
            String password="123456789";

            Connection con =DriverManager.getConnection(url, username, password);
            String sql="insert into chuyennganh(manganh,tennganh) values (?,?)";//
            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,txtMaNganh.getText());
            ps.setString(2, txtTenNganh.getText());
          

            ps.executeUpdate();//để thực hiện câu lệnh insert into và đưa dữ liệu vào trong cơ sở dữ liệu
            loadDulieu();
            JOptionPane.showMessageDialog(this, "thêm thành công ");
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbldulieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldulieuMouseClicked
         int row=tbldulieu.getSelectedRow();

        if(row>=0){
            txtMaNganh.setText(tbldulieu.getValueAt(row, 0).toString());          
            txtTenNganh.setText(tbldulieu.getValueAt(row, 1).toString());
           
        }

    }//GEN-LAST:event_tbldulieuMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        txtMaNganh.disable();
        if(txtMaNganh.getText().equals("")||txtTenNganh.getText().equals("")){
            JOptionPane.showMessageDialog(this,"chưa có thông tin để sửa");
            return;
        }else{
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=quanlysinhvien";
            String username="sa";
            String password="123456789";

            Connection con =DriverManager.getConnection(url, username, password);
            String sql="UPDATE chuyennganh"+ " SET tennganh =?"+" where manganh=?";
            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(2,txtMaNganh.getText());
            ps.setString(1, txtTenNganh.getText());
          

            ps.executeUpdate();//để thực hiện câu lệnh insert into và đưa dữ liệu vào trong cơ sở dữ liệu
            loadDulieu();
            JOptionPane.showMessageDialog(this, "sửa thành công ");
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if(JOptionPane.showConfirmDialog(this, "bạn có muốn xóa không?")==JOptionPane.NO_OPTION){
            return;
        }
         if(txtMaNganh.getText().equals("")||txtTenNganh.getText().equals("")){
            JOptionPane.showMessageDialog(this,"chưa có thông tin để xóa");
            return;
        }else{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=quanlysinhvien";
            String username="sa";
            String password="123456789";

            Connection con =DriverManager.getConnection(url, username, password);
            String sql="delete from chuyennganh where manganh=?";
            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,txtMaNganh.getText());
           
          

            ps.executeUpdate();//để thực hiện câu lệnh insert into và đưa dữ liệu vào trong cơ sở dữ liệu
            loadDulieu();
            JOptionPane.showMessageDialog(this, "xóa thành công ");
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }}
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnNhapmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapmoiActionPerformed
        txtMaNganh.setText("");
        txtTenNganh.setText("");
    }//GEN-LAST:event_btnNhapmoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapmoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbldulieu;
    private javax.swing.JTextField txtMaNganh;
    private javax.swing.JTextField txtTenNganh;
    // End of variables declaration//GEN-END:variables

    
}
