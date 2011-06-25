
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class NameAndColorDialog_UI extends javax.swing.JDialog {

    Color color;
    String newName;

    /** Creates new form NameAndColorDialog_UI */
    public NameAndColorDialog_UI(java.awt.Frame parent, boolean modal, Color c, String newName) {
        super(parent, modal);
        this.color = c;
        this.newName = newName;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        white = new javax.swing.JLabel();
        brown = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        yellow = new javax.swing.JLabel();
        blue = new javax.swing.JLabel();
        green = new javax.swing.JLabel();
        cyan = new javax.swing.JLabel();
        fushia = new javax.swing.JLabel();
        orange = new javax.swing.JLabel();
        darkYellow = new javax.swing.JLabel();
        grey = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        currentColor = new javax.swing.JLabel();
        colorChooser = new javax.swing.JButton();
        nameLabel = new javax.swing.JTextField();
        mainLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        white.setBackground(new java.awt.Color(255, 255, 255));
        white.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        white.setOpaque(true);
        white.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(white);

        brown.setBackground(new java.awt.Color(51, 0, 0));
        brown.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brown.setOpaque(true);
        brown.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(brown);

        red.setBackground(new java.awt.Color(204, 0, 0));
        red.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        red.setOpaque(true);
        red.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(red);

        yellow.setBackground(new java.awt.Color(255, 255, 0));
        yellow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yellow.setOpaque(true);
        yellow.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(yellow);

        blue.setBackground(new java.awt.Color(0, 0, 204));
        blue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blue.setOpaque(true);
        blue.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(blue);

        green.setBackground(new java.awt.Color(0, 255, 0));
        green.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        green.setOpaque(true);
        green.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(green);

        cyan.setBackground(new java.awt.Color(0, 255, 204));
        cyan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cyan.setOpaque(true);
        cyan.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(cyan);

        fushia.setBackground(new java.awt.Color(255, 0, 204));
        fushia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fushia.setOpaque(true);
        fushia.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(fushia);

        orange.setBackground(new java.awt.Color(255, 124, 0));
        orange.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        orange.setOpaque(true);
        orange.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(orange);

        darkYellow.setBackground(new java.awt.Color(102, 102, 0));
        darkYellow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        darkYellow.setOpaque(true);
        darkYellow.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(darkYellow);

        grey.setBackground(new java.awt.Color(102, 102, 102));
        grey.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grey.setOpaque(true);
        grey.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(grey);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        jLabel14.setText("Selected color : ");
        jPanel2.add(jLabel14);

        currentColor.setBackground(new java.awt.Color(255, 255, 255));
        currentColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        currentColor.setMaximumSize(new java.awt.Dimension(40, 40));
        currentColor.setOpaque(true);
        currentColor.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(currentColor);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(jPanel2, gridBagConstraints);

        colorChooser.setText("Color chooser");
        colorChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorChooserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel3.add(colorChooser, gridBagConstraints);

        mainLabel.setText("MainLabel");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(mainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancel, ok});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(ok)))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancel, ok});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
    this.color = this.currentColor.getBackground();
    this.newName = this.nameLabel.getText();
    this.dispose();
}//GEN-LAST:event_okActionPerformed

private void colorChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorChooserActionPerformed
    this.color = this.currentColor.getBackground();
}//GEN-LAST:event_colorChooserActionPerformed

private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
    this.dispose();
}//GEN-LAST:event_cancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NameAndColorDialog_UI dialog = new NameAndColorDialog_UI(new javax.swing.JFrame(), true,Color.white,"");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel blue;
    protected javax.swing.JLabel brown;
    protected javax.swing.JButton cancel;
    protected javax.swing.JButton colorChooser;
    protected javax.swing.JLabel currentColor;
    protected javax.swing.JLabel cyan;
    protected javax.swing.JLabel darkYellow;
    protected javax.swing.JLabel fushia;
    protected javax.swing.JLabel green;
    protected javax.swing.JLabel grey;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    protected javax.swing.JPanel jPanel4;
    protected javax.swing.JPanel jPanel5;
    protected javax.swing.JSeparator jSeparator1;
    protected javax.swing.JLabel mainLabel;
    protected javax.swing.JTextField nameLabel;
    protected javax.swing.JButton ok;
    protected javax.swing.JLabel orange;
    protected javax.swing.JLabel red;
    protected javax.swing.JLabel white;
    protected javax.swing.JLabel yellow;
    // End of variables declaration//GEN-END:variables

}
