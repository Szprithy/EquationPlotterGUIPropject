/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.sd;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Toolkit;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 *
 */
public class Parabola extends javax.swing.JFrame {

    /**
     * Creates new form Parabola
     */
    public Parabola() {
        this.setUndecorated (true);
        this.setVisible (true);
        this.setAlwaysOnTop (true);
        this.setResizable (false);

        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();

        //int xsize,ysize;
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();

        this.setSize (xsize,ysize);

    }
public class XYLineChart_AWT extends ApplicationFrame
    {
        public XYLineChart_AWT( String applicationTitle, String chartTitle, XYSeriesCollection dataset )
        {
            super(applicationTitle);
            this.setUndecorated(true);
            JFreeChart xylineChart = ChartFactory.createXYLineChart(chartTitle ,"Category" ,"Score" ,dataset ,PlotOrientation.VERTICAL ,true , true , false);

            ChartPanel chartPanel = new ChartPanel( xylineChart );
            chartPanel.setPreferredSize( new java.awt.Dimension( 1200 , 450 ) );
            XYPlot plot = xylineChart.getXYPlot( );
            XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
            renderer.setSeriesPaint( 0 , Color.RED );
            renderer.setSeriesStroke( 0 , new BasicStroke( 1.0f ) );
            plot.setRenderer( renderer );
            setContentPane( chartPanel );
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

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel());
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(830, 750, 29, 20);

        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(970, 750, 29, 20);

        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(1110, 760, 29, 20);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1270, 710, 55, 23);

        jLabel6.setFont(new java.awt.Font("Telenor", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Parabola f(x) :  x^2=4ay");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 50, 660, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\background new.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
 int a, b, k;
        double x, y, i, mx, mn;
        a=(int)jSpinner1.getValue();
        b=(int)jSpinner2.getValue();
        k=(int)jSpinner3.getValue();
        //Using jFreeChart to form the chart
        String s;
        s = "X^2=4AY";
        mn=Math.min(a,b);
        mx=Math.max(a,b);
        XYSeries graph = new XYSeries(s);
        for(i=mn; i<=mx; i+=0.01){
            x = i;
            y=(x*x)/(4*k);
            graph.add(x,y);
            //System.out.println(x + " " + y);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(graph);
        XYLineChart_AWT chart = new XYLineChart_AWT("Graph", " ", dataset); // This constructor is given above
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
        chart.setAlwaysOnTop(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new Options().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
int a, b, k;
        double x, y, i, mx, mn;
        a=(int)jSpinner1.getValue();
        b=(int)jSpinner2.getValue();
        k=(int)jSpinner3.getValue();
        //Using jFreeChart to form the chart
        String s;
        s = "X^2=4AY";
        mn=Math.min(a,b);
        mx=Math.max(a,b);
        XYSeries graph = new XYSeries(s);
        for(i=mn; i<=mx; i+=0.01){
            x = i;
            y=(x*x)/(4*k);
            graph.add(x,y);
            //System.out.println(x + " " + y);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(graph);
        XYLineChart_AWT chart = new XYLineChart_AWT("Graph", " ", dataset); // This constructor is given above
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
        chart.setAlwaysOnTop(true);        // TODO add your handling code here:
         // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
int a, b, k;
        double x, y, i, mx, mn;
        a=(int)jSpinner1.getValue();
        b=(int)jSpinner2.getValue();
        k=(int)jSpinner3.getValue();
        //Using jFreeChart to form the chart
        String s;
        s = "X^2=4AY";
        mn=Math.min(a,b);
        mx=Math.max(a,b);
        XYSeries graph = new XYSeries(s);
        for(i=mn; i<=mx; i+=0.01){
            x = i;
            y=(x*x)/(4*k);
            graph.add(x,y);
            //System.out.println(x + " " + y);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(graph);
        XYLineChart_AWT chart = new XYLineChart_AWT("Graph", " ", dataset); // This constructor is given above
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
        chart.setAlwaysOnTop(true);        // TODO add your handling code here:
         // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner3StateChanged

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
            java.util.logging.Logger.getLogger(Parabola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parabola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parabola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parabola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parabola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    // End of variables declaration//GEN-END:variables
}
