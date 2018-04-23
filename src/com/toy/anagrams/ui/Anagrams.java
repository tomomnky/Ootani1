/*
 * Copyright (c) 2010, Oracle.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  * Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/* Anagram Game Application */

package com.toy.anagrams.ui;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.toy.anagrams.lib.WordLibrary;

/**
 * Main window of the Anagram Game application.
 */
public class Anagrams extends JFrame {

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Anagrams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anagrams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anagrams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anagrams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Anagrams().setVisible(true);
            }
        });
    }

    private int wordIdx = 0;
    private WordLibrary wordLibrary;

    /** Creates new form Anagrams */
    public Anagrams() {
        wordLibrary = WordLibrary.getDefault(); //staticwordのコンストラクタ

        initComponents();
        getRootPane().setDefaultButton(guessButton);
        scrambledWord.setText(sort(wordLibrary.getWord(wordIdx)));//スクランブルワード取り出し
        pack();
        guessedWord.requestFocusInWindow();
        // Center in the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.width) / 2));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        //teamLabel = new javax.swing.JLabel();
        scrambledLabel = new javax.swing.JLabel();
        scrambledWord = new javax.swing.JTextField();
        guessLabel = new javax.swing.JLabel();
        guessedWord = new javax.swing.JTextField();
        feedbackLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        guessButton = new javax.swing.JButton();
        nextTrial = new javax.swing.JButton();
        levelLabel = new javax.swing.JLabel();
        selectLevel = new javax.swing.JComboBox();
        mainMenu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setTitle("アルファベットを並べ替えて単語を作りなさい");//ウィンドウのタイトル  アルファベットを並べ替えて単語を作りなさい
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        mainPanel.setMinimumSize(new java.awt.Dimension(297, 200));
        mainPanel.setLayout(new java.awt.GridBagLayout());


        scrambledLabel.setText("問題:");//問題
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 12, 6);
        mainPanel.add(scrambledLabel, gridBagConstraints);

        scrambledWord.setEditable(false);
        scrambledWord.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 12, 0);
        mainPanel.add(scrambledWord, gridBagConstraints);

        guessLabel.setDisplayedMnemonic('Y');
        guessLabel.setLabelFor(guessedWord);
        guessLabel.setText("回答:");//こたえ
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 6);
        mainPanel.add(guessLabel, gridBagConstraints);

        guessedWord.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        mainPanel.add(guessedWord, gridBagConstraints);

        feedbackLabel.setText("aaaaaaaaaaaaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        mainPanel.add(feedbackLabel, gridBagConstraints);

        buttonsPanel.setLayout(new java.awt.GridBagLayout());

        guessButton.setMnemonic('G');
        guessButton.setText("Guess");
        guessButton.setToolTipText("Guess the scrambled word.");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessedWordActionPerformed(evt);
            }
        });
        buttonsPanel.add(guessButton, new java.awt.GridBagConstraints());

        nextTrial.setMnemonic('N');
        nextTrial.setText("New Word");
        nextTrial.setToolTipText("Fetch a new word.");
        nextTrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTrialActionPerformed(evt);
            }
        });
        buttonsPanel.add(nextTrial, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(buttonsPanel, gridBagConstraints);

        levelLabel.setText("レベル:");//レベル
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        mainPanel.add(levelLabel, gridBagConstraints);

        selectLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Level 1", "Level 2", "Level 3" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        mainPanel.add(selectLevel, gridBagConstraints);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        fileMenu.setMnemonic('大');//ここをチーム名　メンバーにする
        fileMenu.setText("大谷　仲山友海・鳥居みなほ・湯浅郁");


        aboutMenuItem.setMnemonic('A');
        aboutMenuItem.setText("About");
        aboutMenuItem.setToolTipText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(aboutMenuItem);

        exitMenuItem.setMnemonic('E');
        exitMenuItem.setText("Exit");
        exitMenuItem.setToolTipText("Quit Team, Quit!");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        mainMenu.add(fileMenu);

        setJMenuBar(mainMenu);
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        new About(this).setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void nextTrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTrialActionPerformed
        wordIdx = (wordIdx + 1) % wordLibrary.getSize();

        feedbackLabel.setText(" ");
        scrambledWord.setText(sort(wordLibrary.getWord(wordIdx)));//2回目以降のスクランブルワード取り出し
        guessedWord.setText("");
        getRootPane().setDefaultButton(guessButton);

        guessedWord.requestFocusInWindow();
    }//GEN-LAST:event_nextTrialActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void guessedWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessedWordActionPerformed
        if (wordLibrary.isCorrect(wordIdx, guessedWord.getText())){
            feedbackLabel.setText("Correct! Try a new word!");
            getRootPane().setDefaultButton(nextTrial);
        } else {
            feedbackLabel.setText("Incorrect! Try again!");
            guessedWord.setText("");
        }

        guessedWord.requestFocusInWindow();
    }//GEN-LAST:event_guessedWordActionPerformed

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    //問題の文字列を作るメソッド
    /*
     //答えの単語を取り出して配列にいれる
     //１番目とランダム番目を変更する。
      * 文字列の半分以上回す。レベル増やすと増えるように
     */
    public String sort(String word) {
    char[] arrayQ = word.toCharArray();//一文字づつの配列
    char[] arrayQc = word.toCharArray();//入れ替え用のコピー

	Random r = new Random();
	int ran1 = r.nextInt(word.length());

	arrayQ[0] = arrayQc[ran1];
	arrayQ[ran1] = arrayQc[0];

	String ans = String.valueOf(arrayQ);
	return ans;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton guessButton;
    private javax.swing.JLabel guessLabel;
    private javax.swing.JTextField guessedWord;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nextTrial;
    private javax.swing.JLabel scrambledLabel;
    private javax.swing.JTextField scrambledWord;
    private javax.swing.JComboBox selectLevel;
    // End of variables declaration//GEN-END:variables

}
