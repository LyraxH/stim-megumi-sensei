
/**
 * Holds the window settings and stuff
 *
 * @ ts
 * @ 08/04/24 ->
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Window extends JFrame implements ActionListener, KeyListener, MouseListener
{
    Scanner input = new Scanner(System.in);
    Images img = new Images(); // imports images from other class
    Game game = new Game(); // imports data from game region

    // chat window variables
    JLabel textUpdateOne = new JLabel("FILLER TEXT NUMBER ONE NO ONE WILL EVER SEE THIS XDD");
    JLabel textUpdateTwo = new JLabel("https://youtube.com/@lyraxh");
    JLabel textUpdateThree = new JLabel("ASDASDASD");

    // enemy window variables
    JButton enemyOneButton = new JButton();
    JButton enemyTwoButton = new JButton();
    JButton enemyThreeButton = new JButton();
    JButton enemyFourButton = new JButton();
    JLabel enemyOneHPText = new JLabel("300 / 300");
    JLabel enemyTwoHPText = new JLabel("300 / 300");
    JLabel enemyThreeHPText = new JLabel("300 / 300");
    JLabel enemyFourHPText = new JLabel("300 / 300");

    // ally window variables
    JButton allyOneButton = new JButton();
    JButton allyTwoButton = new JButton();
    JButton allyThreeButton = new JButton();
    JButton allyFourButton =  new JButton();
    JLabel allyOneHPText = new JLabel("HP: 200 / 200");
    JLabel allyTwoHPText = new JLabel("HP: 200 / 200");
    JLabel allyThreeHPText = new JLabel("HP: 200 / 200");
    JLabel allyFourHPText = new JLabel("HP: 200 / 200");
    JLabel allyOneSPText = new JLabel("SP: 150 / 150");
    JLabel allyTwoSPText = new JLabel("SP: 150 / 150");
    JLabel allyThreeSPText = new JLabel("SP: 150 / 150");
    JLabel allyFourSPText = new JLabel("SP: 150 / 150");

    //move window variables
    JLabel currentMoveText = new JLabel("Ally One");
    JButton moveButtonOne = new JButton(img.attackIcon);
    JButton moveButtonTwo = new JButton(img.unGuardIcon);
    JButton moveButtonThree = new JButton(img.unMagicIcon);
    JButton moveButtonFour = new JButton(img.unItemIcon);

    // game window variables
    JLabel allyOneSprite = new JLabel();
    JLabel allyTwoSprite = new JLabel();
    JLabel allyThreeSprite = new JLabel();
    JLabel allyFourSprite = new JLabel();
    JLabel enemyOneSprite = new JLabel();
    JLabel enemyTwoSprite = new JLabel();
    JLabel enemyThreeSprite = new JLabel();
    JLabel enemyFourSprite = new JLabel();

    // j menu variables
    JMenuBar menuBar = new JMenuBar();
    JMenu system = new JMenu("System");
    JMenu difficulty = new JMenu("Difficulty");
    JMenu battleLog = new JMenu("Battle Log");
    JMenuItem goBackItem = new JMenuItem("Go Back");
    JMenuItem quitGame = new JMenuItem("Quit Game");
    JMenuItem easyDif = new JMenuItem("Easy");
    JMenuItem mediumDif = new JMenuItem("Medium");
    JMenuItem hardDif = new JMenuItem("Hard");
    JMenuItem displayBattleLog = new JMenuItem("Display Battle Log");
    
    // panel for different regions of the game
    JPanel moveWindow = new JPanel(); // where actions can be taken
    JPanel chatWindow = new JPanel(); // where text of the actions taken is displayed
    
    JLayeredPane enemyWindow = new JLayeredPane();
    JPanel enemyWindowBase = new JPanel();
    JPanel enemyWindowBackgroundPanel = new JPanel();
    JLabel enemyWindowBackground = new JLabel();
    
    JLayeredPane allyWindow = new JLayeredPane();
    JPanel allyWindowBase = new JPanel(); // where ally health is displayed
    JPanel allyWindowBackgroundPanel = new JPanel();
    JLabel allyWindowBackground = new JLabel();
    
    JLayeredPane gameWindow = new JLayeredPane();
    JPanel gameWindowBase = new JPanel(); // where the characters are displayed
    JPanel gameWindowStats = new JPanel(); // stat overlay
    JPanel gameWindowAttack = new JPanel(); // attack
    JPanel gameWindowDefense = new JPanel(); // defense
    JPanel gameWindowDead = new JPanel(); // skull emoji
    JPanel gameWindowAffinities = new JPanel();  // where weakness indicator is displayed
    JPanel gameWindowBackgroundPanel = new JPanel();
    JLabel gameWindowBackground = new JLabel();

    public Window(){
        game.Start();
        setImages();
        setMenu();
        // adding panel regions to the jframe
        this.add(gameWindow, BorderLayout.CENTER);
        this.add(enemyWindow, BorderLayout.LINE_START);
        this.add(allyWindow, BorderLayout.LINE_END);
        this.add(chatWindow, BorderLayout.PAGE_START);
        this.add(moveWindow, BorderLayout.PAGE_END);

        // adding variables to the chat window region
        chatWindow.setLayout(new BoxLayout(chatWindow, BoxLayout.PAGE_AXIS));
        textUpdateOne.setAlignmentX(CENTER_ALIGNMENT);
        textUpdateTwo.setAlignmentX(CENTER_ALIGNMENT);
        textUpdateThree.setAlignmentX(CENTER_ALIGNMENT);
        chatWindow.add(textUpdateOne);
        chatWindow.add(textUpdateTwo);
        chatWindow.add(textUpdateThree);
        moveWindow.setBackground(Color.magenta);
        allyWindow.setBackground(Color.green);

        // setting grid layouts to the panels required
        moveWindow.setLayout(new GridLayout(1,0));
        gameWindowStats.setLayout(new GridLayout(3, 4));
        gameWindowAttack.setLayout(new GridLayout(3, 4));
        gameWindowDefense.setLayout(new GridLayout(3, 4));
        gameWindowAffinities.setLayout(new GridLayout(3, 4));
        gameWindowDead.setLayout(new GridLayout(3,4));
        gameWindowBase.setLayout(new GridLayout(3, 4));
        allyWindowBase.setLayout(new GridLayout(4,3));
        enemyWindowBase.setLayout(new GridLayout(4,2));
        
        chatWindow.setPreferredSize(new Dimension(0, 50));
        moveWindow.setPreferredSize(new Dimension(0, 200));
        gameWindow.setPreferredSize(new Dimension(730, 470));
        allyWindow.setPreferredSize(new Dimension(300, 470));
        enemyWindow.setPreferredSize(new Dimension(250, 470));
        
        
        gameWindowDead.setBounds(0,-5,730,480);
        gameWindowStats.setBounds(0,-5,730,480);
        gameWindowAttack.setBounds(0,-5,730,480);
        gameWindowDefense.setBounds(0,-5,730,480);
        gameWindowAffinities.setBounds(0,-5,730,480);
        gameWindow.setBounds(0,-5,730,480);
        gameWindowBase.setBounds(0,-5,730,480);
        gameWindowBackgroundPanel.setBounds(0,-5,730,480);
        allyWindow.setBounds(0,-5,300,480);
        allyWindowBase.setBounds(0,-5,300,480);
        allyWindowBackgroundPanel.setBounds(0,-5,300,480);
        enemyWindow.setBounds(0,-5,250,480);
        enemyWindowBase.setBounds(0,-5,250,480);
        enemyWindowBackgroundPanel.setBounds(0,-5,250,480);
        
        cleanUp();

        //adding panels to enemy window
        enemyWindow.add(enemyWindowBackgroundPanel, new Integer(0), 0);
        enemyWindow.add(enemyWindowBase, new Integer(1), 0);
        // adding panels to ally window
        allyWindow.add(allyWindowBackgroundPanel, new Integer(0), 0);
        allyWindow.add(allyWindowBase, new Integer(1), 0);
        // adding panels to game window
        gameWindow.add(gameWindowBackgroundPanel, new Integer(0), 0);
        gameWindow.add(gameWindowBase, new Integer(1), 0);
        gameWindow.add(gameWindowAffinities, new Integer(2), 0);
        gameWindow.add(gameWindowStats, new Integer(3), 0);
        gameWindow.add(gameWindowAttack, new Integer(4), 0);
        gameWindow.add(gameWindowDefense, new Integer(5), 0);
        gameWindow.add(gameWindowDead, new Integer(6), 0);

        updateUI();
        initialize();
    }
    
    ActionListener taskPerformer = new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        game.goNext();
        updateUI();
        }
    };    
    
    public void clearAffinity(){
        img.enemyOneAffinity.setIcon(null);
        img.enemyTwoAffinity.setIcon(null);
        img.enemyThreeAffinity.setIcon(null);
        img.enemyFourAffinity.setIcon(null);
        img.allyOneAffinity.setIcon(null);
        img.allyTwoAffinity.setIcon(null);
        img.allyThreeAffinity.setIcon(null);
        img.allyFourAffinity.setIcon(null);
    }
    
    public void addAndRemove(){
        enemyOneSprite.setIcon(img.archangelIMG);
        enemyTwoSprite.setIcon(img.jackFrostIMG);
        enemyThreeSprite.setIcon(img.legionIMG);
        enemyFourSprite.setIcon(img.principalityIMG);
        allyOneSprite.setIcon(img.ameNoUzumeIMG);
        allyTwoSprite.setIcon(img.cendrillonIMG);
        allyThreeSprite.setIcon(img.orpheusIMG);
        allyFourSprite.setIcon(img.robinHoodIMG);
    }
    
    public void updateUI(){
        displayStatus(game.target, game.status);
        game.checkInjured();
        
        
        Timer timer = new Timer(3000, taskPerformer);
        timer.setRepeats(false);
        
        if (game.turn == 1){
            switch (game.currentCharacter){
                case 0:
                    timer.start();
                    break;
                case 1:
                    timer.start();
                    break;
                case 2:
                    timer.start();
                    break;
                case 3:
                    timer.start();
                    break;
            }
        }
        
        // UPDATE CURRENT MOVE TEXT
        switch (game.turn){
            case 0:
                switch (game.currentCharacter){
                    case 0:
                        currentMoveText.setText("Ame No Uzume");
                        addAndRemove();
                        allyOneSprite.setIcon(img.ameNoUzumeSelected);
                        break;
                    case 1:
                        currentMoveText.setText("Cendrillon");
                        addAndRemove();
                        allyTwoSprite.setIcon(img.cendrillonSelected);
                        break;
                    case 2:
                        currentMoveText.setText("Orpheus");
                        addAndRemove();
                        allyThreeSprite.setIcon(img.orpheusSelected);
                        break;
                    case 3:
                        currentMoveText.setText("Robin Hood");
                        addAndRemove();
                        allyFourSprite.setIcon(img.robinHoodSelected);
                        break;
                }
                img.turnIndicatorOne.setIcon(img.playerTurnOne);
                img.turnIndicatorTwo.setIcon(img.playerTurnTwo);
                img.turnIndicatorThree.setIcon(img.playerTurnThree);
                img.turnIndicatorFour.setIcon(img.playerTurnFour);
                break;
            case 1:
                switch (game.currentCharacter){
                    case 0:
                        currentMoveText.setText("Archangel");
                        addAndRemove();
                        enemyOneSprite.setIcon(img.archangelSelected);
                        break;
                    case 1:
                        currentMoveText.setText("Jack Frost");
                        addAndRemove();
                        enemyTwoSprite.setIcon(img.jackFrostSelected);
                        break;
                    case 2:
                        currentMoveText.setText("Legion");
                        addAndRemove();
                        enemyThreeSprite.setIcon(img.legionSelected);
                        break;
                    case 3:
                        currentMoveText.setText("Principality");
                        addAndRemove();
                        enemyFourSprite.setIcon(img.principalitySelected);
                        break;
                }
                img.turnIndicatorOne.setIcon(img.enemyTurnOne);
                img.turnIndicatorTwo.setIcon(img.enemyTurnTwo);
                img.turnIndicatorThree.setIcon(img.enemyTurnThree);
                img.turnIndicatorFour.setIcon(img.enemyTurnFour);
                break;
            case 2:
                img.turnIndicatorOne.setIcon(img.youLoseOne);
                img.turnIndicatorTwo.setIcon(img.youLoseTwo);
                img.turnIndicatorThree.setIcon(img.youLoseThree);
                img.turnIndicatorFour.setIcon(img.youLoseFour);
                break;
            case 3:
                img.turnIndicatorOne.setIcon(img.youWinOne);
                img.turnIndicatorTwo.setIcon(img.youWinTwo);
                img.turnIndicatorThree.setIcon(img.youWinThree);
                img.turnIndicatorFour.setIcon(img.youWinFour);
                break;
        }
        
        //UPDATE ACTION COMMANDS FOR INTERACTABLE ICONS
        allyOneButton.setActionCommand("ameNoUzume");
        allyTwoButton.setActionCommand("cendrillon");
        allyThreeButton.setActionCommand("orpheus");
        allyFourButton.setActionCommand("robinHood");
        enemyOneButton.setActionCommand("archangel");
        enemyTwoButton.setActionCommand("jackFrost");
        enemyThreeButton.setActionCommand("legion");
        enemyFourButton.setActionCommand("principality");
        switch (game.page){
            case 0: // if main page
                moveButtonOne.setActionCommand("attack");
                moveButtonTwo.setActionCommand("guard");
                moveButtonThree.setActionCommand("magic");
                moveButtonFour.setActionCommand("item");
                break;
            case 1: // if enemy select
                moveButtonOne.setActionCommand("enemyOne");
                moveButtonTwo.setActionCommand("enemyTwo");
                moveButtonThree.setActionCommand("enemyThree");
                moveButtonFour.setActionCommand("enemyFour");
                break;
            case 2: // if magic
                moveButtonOne.setActionCommand("magicOne");
                moveButtonTwo.setActionCommand("magicTwo");
                moveButtonThree.setActionCommand("magicThree");
                moveButtonFour.setActionCommand("magicFour");
                break;
            case 3: // if item
                moveButtonOne.setActionCommand("itemOne");
                moveButtonTwo.setActionCommand("itemTwo");
                moveButtonThree.setActionCommand("itemThree");
                moveButtonFour.setActionCommand("itemFour");
                break;
            case 4: // for ally select (healing spells)
                moveButtonOne.setActionCommand("allyOne");
                moveButtonTwo.setActionCommand("allyTwo");
                moveButtonThree.setActionCommand("allyThree");
                moveButtonFour.setActionCommand("allyFour");
                break;
            case 5: // if all enemy select
                moveButtonOne.setActionCommand("allEnemies");
                moveButtonTwo.setActionCommand("allEnemies");
                moveButtonThree.setActionCommand("allEnemies");
                moveButtonFour.setActionCommand("allEnemies");
        }
        
        // UPDATE HP AND SP
        allyOneHPText.setText("       " + game.hpAlly[0] + " / " + game.hpMaxAlly[0]);
        allyOneSPText.setText("       " + game.spAlly[0] + " / " + game.spMaxAlly[0]);
        allyTwoHPText.setText("       " + game.hpAlly[1] + " / " + game.hpMaxAlly[1]);
        allyTwoSPText.setText("       " + game.spAlly[1] + " / " + game.spMaxAlly[1]);
        allyThreeHPText.setText("       " + game.hpAlly[2] + " / " + game.hpMaxAlly[2]);
        allyThreeSPText.setText("       " + game.spAlly[2] + " / " + game.spMaxAlly[2]);
        allyFourHPText.setText("       " + game.hpAlly[3] + " / " + game.hpMaxAlly[3]);
        allyFourSPText.setText("       " + game.spAlly[3] + " / " + game.spMaxAlly[3]);
        enemyOneHPText.setText("       " + game.hpEnemy[0] + " / " + game.hpMaxEnemy[0]);
        enemyTwoHPText.setText("       " + game.hpEnemy[1] + " / " + game.hpMaxEnemy[1]);
        enemyThreeHPText.setText("       " + game.hpEnemy[2] + " / " + game.hpMaxEnemy[2]);
        enemyFourHPText.setText("       " + game.hpEnemy[3] + " / " + game.hpMaxEnemy[3]);
        
        //UPDATE TEXT HISTORY
        int size = game.textHistory.size();
        textUpdateOne.setText(game.textHistory.get(size - 3));
        textUpdateTwo.setText(game.textHistory.get(size - 2));
        textUpdateThree.setText(game.textHistory.get(size - 1));
        //System.out.println(game.textHistory.get(size - 1));
        
        //UPDATE SELECTABLE ICONS
        if (game.turn == 0){
            chatWindow.setBackground(Color.green);
            moveWindow.add(currentMoveText);
            moveWindow.add(moveButtonOne);
            moveWindow.add(moveButtonTwo);
            moveWindow.add(moveButtonThree);
            moveWindow.add(moveButtonFour);
            switch (game.page){ // what menu
                case 0: // if main menu
                    switch (game.selected){
                        case 0: // if attack selected
                            moveButtonOne.setIcon(img.attackIcon);
                            moveButtonTwo.setIcon(img.unGuardIcon);
                            moveButtonThree.setIcon(img.unMagicIcon);
                            moveButtonFour.setIcon(img.unItemIcon);
                            break;
                        case 1: // if guard selected
                            moveButtonOne.setIcon(img.unAttackIcon);
                            moveButtonTwo.setIcon(img.guardIcon);
                            moveButtonThree.setIcon(img.unMagicIcon);
                            moveButtonFour.setIcon(img.unItemIcon);
                            break;
                        case 2: // if magic selected
                            moveButtonOne.setIcon(img.unAttackIcon);
                            moveButtonTwo.setIcon(img.unGuardIcon);
                            moveButtonThree.setIcon(img.magicIcon);
                            moveButtonFour.setIcon(img.unItemIcon);
                            break;
                        case 3: // if item selected
                            moveButtonOne.setIcon(img.unAttackIcon);
                            moveButtonTwo.setIcon(img.unGuardIcon);
                            moveButtonThree.setIcon(img.unMagicIcon);
                            moveButtonFour.setIcon(img.itemIcon);
                            break;
                    }
                    break;
                case 1: // if selecting which enemy to attack single target
                    switch (game.selected){
                        case 0:
                            moveButtonOne.setIcon(img.enemyOne);
                            moveButtonTwo.setIcon(img.unEnemyTwo);
                            moveButtonThree.setIcon(img.unEnemyThree);
                            moveButtonFour.setIcon(img.unEnemyFour);
                            break;
                        case 1:
                            moveButtonOne.setIcon(img.unEnemyOne);
                            moveButtonTwo.setIcon(img.enemyTwo);
                            moveButtonThree.setIcon(img.unEnemyThree);
                            moveButtonFour.setIcon(img.unEnemyFour);
                            break;
                        case 2:
                            moveButtonOne.setIcon(img.unEnemyOne);
                            moveButtonTwo.setIcon(img.unEnemyTwo);
                            moveButtonThree.setIcon(img.enemyThree);
                            moveButtonFour.setIcon(img.unEnemyFour);
                            break;
                        case 3:
                            moveButtonOne.setIcon(img.unEnemyOne);
                            moveButtonTwo.setIcon(img.unEnemyTwo);
                            moveButtonThree.setIcon(img.unEnemyThree);
                            moveButtonFour.setIcon(img.enemyFour);
                            break;
                    }
                    break;
                case 5: // if selecting which enemies to multi target (yes i know case 1: into case 5: is gross but id rather have the attacks together
                    moveButtonOne.setIcon(img.enemyOne);
                    moveButtonTwo.setIcon(img.enemyTwo);
                    moveButtonThree.setIcon(img.enemyThree);
                    moveButtonFour.setIcon(img.enemyFour);
                    break;
                case 2: // if in magic attack
                    if (game.turn == 0 ){ //if the turn is an ally that you can see abilities for
                        switch (game.currentCharacter){
                            case 0: // ame no uzume
                                switch (game.selected){
                                    case 0: // if move one selected
                                        moveButtonOne.setIcon(img.zephyr); // single target wind
                                        moveButtonTwo.setIcon(img.unMonsoon); // multi target wind
                                        moveButtonThree.setIcon(img.unRedemption);
                                        moveButtonFour.setIcon(img.unGuardianAngel);
                                        break;
                                    case 1: // if move two selected
                                        moveButtonOne.setIcon(img.unZephyr); // single target wind
                                        moveButtonTwo.setIcon(img.monsoon); // multi target wind
                                        moveButtonThree.setIcon(img.unRedemption);
                                        moveButtonFour.setIcon(img.unGuardianAngel);
                                        break;
                                    case 2: // if move three selected
                                        moveButtonOne.setIcon(img.unZephyr); // single target wind
                                        moveButtonTwo.setIcon(img.unMonsoon); // multi target wind
                                        moveButtonThree.setIcon(img.redemption);
                                        moveButtonFour.setIcon(img.unGuardianAngel);
                                        break;
                                    case 3: // if move four selected
                                        moveButtonOne.setIcon(img.unZephyr); // single target wind
                                        moveButtonTwo.setIcon(img.unMonsoon); // multi target wind
                                        moveButtonThree.setIcon(img.unRedemption);
                                        moveButtonFour.setIcon(img.guardianAngel);
                                        break;
                                }
                                break;
                            case 1: // cendrillon
                                switch (game.selected){
                                    case 0: // if move one selected
                                        moveButtonOne.setIcon(img.aquaPrison); // single target water
                                        moveButtonTwo.setIcon(img.unSurgingTide); // multi target water
                                        moveButtonThree.setIcon(img.unSnipSnip);
                                        moveButtonFour.setIcon(img.unAtkDown);
                                        break;
                                    case 1: // if move two selected
                                        moveButtonOne.setIcon(img.unAquaPrison); // single target water
                                        moveButtonTwo.setIcon(img.surgingTide); // multi target water
                                        moveButtonThree.setIcon(img.unSnipSnip);
                                        moveButtonFour.setIcon(img.unAtkDown);
                                        break;
                                    case 2: // if move three selected
                                        moveButtonOne.setIcon(img.unAquaPrison); // single target water
                                        moveButtonTwo.setIcon(img.unSurgingTide); // multi target water
                                        moveButtonThree.setIcon(img.snipSnip);
                                        moveButtonFour.setIcon(img.unAtkDown);
                                        break;
                                    case 3: // if move four selected
                                        moveButtonOne.setIcon(img.unAquaPrison); // single target water
                                        moveButtonTwo.setIcon(img.unSurgingTide); // multi target water
                                        moveButtonThree.setIcon(img.unSnipSnip);
                                        moveButtonFour.setIcon(img.atkDownTwo);
                                        break;
                                }
                                break;
                            case 2: // orpheus
                                switch (game.selected){
                                    case 0: // if move one selected
                                        moveButtonOne.setIcon(img.lunarRush); // single target moon
                                        moveButtonTwo.setIcon(img.unMoonfall); // multi target moon
                                        moveButtonThree.setIcon(img.unShatteringStrike);
                                        moveButtonFour.setIcon(img.unDefBoost);
                                        break;
                                    case 1: // if move two selected
                                        moveButtonOne.setIcon(img.unLunarRush); // single target moon
                                        moveButtonTwo.setIcon(img.moonfall); // multi target moon
                                        moveButtonThree.setIcon(img.unShatteringStrike);
                                        moveButtonFour.setIcon(img.unDefBoost);
                                        break;
                                    case 2: // if move three selected
                                        moveButtonOne.setIcon(img.unLunarRush); // single target moon
                                        moveButtonTwo.setIcon(img.unMoonfall); // multi target moon
                                        moveButtonThree.setIcon(img.shatteringStrike);
                                        moveButtonFour.setIcon(img.unDefBoost);
                                        break;
                                    case 3: // if move four selected
                                        moveButtonOne.setIcon(img.unLunarRush); // single target moon
                                        moveButtonTwo.setIcon(img.unMoonfall); // multi target moon
                                        moveButtonThree.setIcon(img.unShatteringStrike);
                                        moveButtonFour.setIcon(img.defBoost);
                                        break;
                                }
                                break;
                            case 3: // robin hood
                                switch (game.selected){
                                    case 0: // if move one selected
                                        moveButtonOne.setIcon(img.zenithBlade); // single target sun
                                        moveButtonTwo.setIcon(img.unSolarFlare); // multi target sun
                                        moveButtonThree.setIcon(img.unSear);
                                        moveButtonFour.setIcon(img.unAtkBoost);
                                        break;
                                    case 1: // if move two selected
                                        moveButtonOne.setIcon(img.unZenithBlade); // single target sun
                                        moveButtonTwo.setIcon(img.solarFlare); // multi target sun
                                        moveButtonThree.setIcon(img.unSear);
                                        moveButtonFour.setIcon(img.unAtkBoost);
                                        break;
                                    case 2: // if move three selected
                                        moveButtonOne.setIcon(img.unZenithBlade); // single target sun
                                        moveButtonTwo.setIcon(img.unSolarFlare); // multi target sun
                                        moveButtonThree.setIcon(img.sear);
                                        moveButtonFour.setIcon(img.unAtkBoost);
                                        break;
                                    case 3: // if move four selected
                                        moveButtonOne.setIcon(img.unZenithBlade); // single target sun
                                        moveButtonTwo.setIcon(img.unSolarFlare); // multi target sun
                                        moveButtonThree.setIcon(img.unSear);
                                        moveButtonFour.setIcon(img.atkBoost);
                                        break;
                                }
                                break;
                        }
                    }
                    break;
                case 3:
                    switch (game.selected){
                        case 0:
                            moveButtonOne.setIcon(img.oracleLens);
                            moveButtonTwo.setIcon(img.unEverfrost);
                            moveButtonThree.setIcon(img.unLightningCrash);
                            moveButtonFour.setIcon(img.unCleanse);
                            break;
                        case 1:
                            moveButtonOne.setIcon(img.unOracleLens);
                            moveButtonTwo.setIcon(img.everfrost);
                            moveButtonThree.setIcon(img.unLightningCrash);
                            moveButtonFour.setIcon(img.unCleanse);
                            break;
                        case 2:
                            moveButtonOne.setIcon(img.unOracleLens);
                            moveButtonTwo.setIcon(img.unEverfrost);
                            moveButtonThree.setIcon(img.lightningCrash);
                            moveButtonFour.setIcon(img.unCleanse);
                            break;
                        case 3:
                            moveButtonOne.setIcon(img.unOracleLens);
                            moveButtonTwo.setIcon(img.unEverfrost);
                            moveButtonThree.setIcon(img.unLightningCrash);
                            moveButtonFour.setIcon(img.cleanse);
                            break;
                    }
                    break;
                case 4: // single target ally healing
                    switch (game.selected){
                        case 0:
                            moveButtonOne.setIcon(img.allyOne);
                            moveButtonTwo.setIcon(img.unAllyTwo);
                            moveButtonThree.setIcon(img.unAllyThree);
                            moveButtonFour.setIcon(img.unAllyFour);
                            break;
                        case 1:
                            moveButtonOne.setIcon(img.unAllyOne);
                            moveButtonTwo.setIcon(img.allyTwo);
                            moveButtonThree.setIcon(img.unAllyThree);
                            moveButtonFour.setIcon(img.unAllyFour);
                            break;
                        case 2:
                            moveButtonOne.setIcon(img.unAllyOne);
                            moveButtonTwo.setIcon(img.unAllyTwo);
                            moveButtonThree.setIcon(img.allyThree);
                            moveButtonFour.setIcon(img.unAllyFour);
                            break;
                        case 3:
                            moveButtonOne.setIcon(img.unAllyOne);
                            moveButtonTwo.setIcon(img.unAllyTwo);
                            moveButtonThree.setIcon(img.unAllyThree);
                            moveButtonFour.setIcon(img.allyFour);
                            break;
                    }
                    break;
            }
        } else if (game.turn == 1){
            chatWindow.setBackground(Color.red);
            moveWindow.removeAll();
            moveWindow.add(currentMoveText);
            moveWindow.repaint();
            moveWindow.revalidate();
        }
        
        // ALLY ONE ------ ALLY ONE
        if (game.allyStats[0][0] == 1){ // ally one attack is normal
            img.attackOverlay5.setIcon(img.atkNorm);
        } else if (game.allyStats[0][0] == 1.6){ // is increased
            img.attackOverlay5.setIcon(img.atkUp);
        } else if (game.allyStats[0][0] == 0.6){ // is decreased
            img.attackOverlay5.setIcon(img.atkDown);
        }
        if (game.allyStats[0][1] == 1){ // ally one defense is normal
            img.defenseOverlay5.setIcon(img.defNorm);
        } else if (game.allyStats[0][1] == 0.6){ // is increased
            img.defenseOverlay5.setIcon(img.defUp);
        } else if (game.allyStats[0][1] == 1.6){ // is decreased
            img.defenseOverlay5.setIcon(img.defDown);
        }
        // ALLY TWO ------ ALLY TWO
        if (game.allyStats[1][0] == 1){ // ally two attack is normal
            img.attackOverlay6.setIcon(img.atkNorm);
        } else if (game.allyStats[1][0] == 1.6){ // is increased
            img.attackOverlay6.setIcon(img.atkUp);
        } else if (game.allyStats[1][0] == 0.6){ // is decreased
            img.attackOverlay6.setIcon(img.atkDown);
        }
        if (game.allyStats[1][1] == 1){ // ally two defense is normal
            img.defenseOverlay6.setIcon(img.defNorm);
        } else if (game.allyStats[1][1] == 0.6){ // is increased
            img.defenseOverlay6.setIcon(img.defUp);
        } else if (game.allyStats[1][1] == 1.6){ // is decreased
            img.defenseOverlay6.setIcon(img.defDown);
        }
        // ALLY THREE ------ ALLY THREE
        if (game.allyStats[2][0] == 1){ // ally three attack is normal
            img.attackOverlay7.setIcon(img.atkNorm);
        } else if (game.allyStats[2][0] == 1.6){ // is increased
            img.attackOverlay7.setIcon(img.atkUp);
        } else if (game.allyStats[2][0] == 0.6){ // is decreased
            img.attackOverlay7.setIcon(img.atkDown);
        }
        if (game.allyStats[2][1] == 1){ // ally three defense is normal
            img.defenseOverlay7.setIcon(img.defNorm);
        } else if (game.allyStats[2][1] == 0.6){ // is increased
            img.defenseOverlay7.setIcon(img.defUp);
        } else if (game.allyStats[2][1] == 1.6){ // is decreased
            img.defenseOverlay7.setIcon(img.defDown);
        }
        // ALLY FOUR ------ ALLY FOUR
        if (game.allyStats[3][0] == 1){ // ally three attack is normal
            img.attackOverlay8.setIcon(img.atkNorm);
        } else if (game.allyStats[3][0] == 1.6){ // is increased
            img.attackOverlay8.setIcon(img.atkUp);
        } else if (game.allyStats[3][0] == 0.6){ // is decreased
            img.attackOverlay8.setIcon(img.atkDown);
        }
        if (game.allyStats[3][1] == 1){ // ally three defense is normal
            img.defenseOverlay8.setIcon(img.defNorm);
        } else if (game.allyStats[3][1] == 0.6){ // is increased
            img.defenseOverlay8.setIcon(img.defUp);
        } else if (game.allyStats[3][1] == 1.6){ // is decreased
            img.defenseOverlay8.setIcon(img.defDown);
        }
        // enemy ONE ------ enemy ONE
        if (game.enemyStats[0][0] == 1){ // enemy one attack is normal
            img.attackOverlay1.setIcon(img.atkNorm);
        } else if (game.enemyStats[0][0] == 1.6){ // is increased
            img.attackOverlay1.setIcon(img.atkUp);
        } else if (game.enemyStats[0][0] == 0.6){ // is decreased
            img.attackOverlay1.setIcon(img.atkDown);
        }
        if (game.enemyStats[0][1] == 1){ // enemy one defense is normal
            img.defenseOverlay1.setIcon(img.defNorm);
        } else if (game.enemyStats[0][1] == 0.6){ // is increased
            img.defenseOverlay1.setIcon(img.defUp);
        } else if (game.enemyStats[0][1] == 1.6){ // is decreased
            img.defenseOverlay1.setIcon(img.defDown);
        }
        // enemy TWO ------ enemy TWO
        if (game.enemyStats[1][0] == 1){ // enemy two attack is normal
            img.attackOverlay2.setIcon(img.atkNorm);
        } else if (game.enemyStats[1][0] == 1.6){ // is increased
            img.attackOverlay2.setIcon(img.atkUp);
        } else if (game.enemyStats[1][0] == 0.6){ // is decreased
            img.attackOverlay2.setIcon(img.atkDown);
        }
        if (game.enemyStats[1][1] == 1){ // enemy two defense is normal
            img.defenseOverlay2.setIcon(img.defNorm);
        } else if (game.enemyStats[1][1] == 0.6){ // is increased
            img.defenseOverlay2.setIcon(img.defUp);
        } else if (game.enemyStats[1][1] == 1.6){ // is decreased
            img.defenseOverlay2.setIcon(img.defDown);
        }
        // enemy THREE ------ enemy THREE
        if (game.enemyStats[2][0] == 1){ // enemy three attack is normal
            img.attackOverlay3.setIcon(img.atkNorm);
        } else if (game.enemyStats[2][0] == 1.6){ // is increased
            img.attackOverlay3.setIcon(img.atkUp);
        } else if (game.enemyStats[2][0] == 0.6){ // is decreased
            img.attackOverlay3.setIcon(img.atkDown);
        }
        if (game.enemyStats[2][1] == 1){ // enemy three defense is normal
            img.defenseOverlay3.setIcon(img.defNorm);
        } else if (game.enemyStats[2][1] == 0.6){ // is increased
            img.defenseOverlay3.setIcon(img.defUp);
        } else if (game.enemyStats[2][1] == 1.6){ // is decreased
            img.defenseOverlay3.setIcon(img.defDown);
        }
        // enemy FOUR ------ enemy FOUR
        if (game.enemyStats[3][0] == 1){ // enemy three attack is normal
            img.attackOverlay4.setIcon(img.atkNorm);
        } else if (game.enemyStats[3][0] == 1.6){ // is increased
            img.attackOverlay4.setIcon(img.atkUp);
        } else if (game.enemyStats[3][0] == 0.6){ // is decreased
            img.attackOverlay4.setIcon(img.atkDown);
        }
        if (game.enemyStats[3][1] == 1){ // enemy three defense is normal
            img.defenseOverlay4.setIcon(img.defNorm);
        } else if (game.enemyStats[3][1] == 0.6){ // is increased
            img.defenseOverlay4.setIcon(img.defUp);
        } else if (game.enemyStats[3][1] == 1.6){ // is decreased
            img.defenseOverlay4.setIcon(img.defDown);
        }
        
        if (game.enemyDead[0] == 1){
            img.deadOverlay1.setIcon(img.dead);
        } else {
            img.deadOverlay1.setIcon(null);
        }
        if (game.enemyDead[1] == 1){
            img.deadOverlay2.setIcon(img.dead);
        } else {
            img.deadOverlay2.setIcon(null);
        }
        if (game.enemyDead[2] == 1){
            img.deadOverlay3.setIcon(img.dead);
        } else {
            img.deadOverlay3.setIcon(null);
        }
        if (game.enemyDead[3] == 1){
            img.deadOverlay4.setIcon(img.dead);
        } else {
            img.deadOverlay4.setIcon(null);
        }
        if (game.allyDead[0] == 1){
            img.deadOverlay5.setIcon(img.dead);
        } else {
            img.deadOverlay5.setIcon(null);
        }
        if (game.allyDead[1] == 1){
            img.deadOverlay6.setIcon(img.dead);
        } else {
            img.deadOverlay6.setIcon(null);
        }
        if (game.allyDead[2] == 1){
            img.deadOverlay7.setIcon(img.dead);
        } else {
            img.deadOverlay7.setIcon(null);
        }
        if (game.allyDead[3] == 1){
            img.deadOverlay8.setIcon(img.dead);
        } else {
            img.deadOverlay8.setIcon(null);
        }
    }
    
    void jRequestFocus(){
        this.requestFocus();
    }

    void initialize(){
        this.setTitle("SMT knock off in java swing for school");
        this.getContentPane().setPreferredSize(new Dimension (1280, 720));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setFocusable(true);
        jRequestFocus();
        this.toFront();

        this.addKeyListener(this);
        allyOneButton.addActionListener(this);
        allyTwoButton.addActionListener(this);
        allyThreeButton.addActionListener(this);
        allyFourButton.addActionListener(this);
        enemyOneButton.addActionListener(this);
        enemyTwoButton.addActionListener(this);
        enemyThreeButton.addActionListener(this);
        enemyFourButton.addActionListener(this);
        moveButtonOne.addActionListener(this);
        moveButtonOne.addMouseListener(this);
        moveButtonTwo.addActionListener(this);
        moveButtonTwo.addMouseListener(this);
        moveButtonThree.addActionListener(this);
        moveButtonThree.addMouseListener(this);
        moveButtonFour.addActionListener(this);
        moveButtonFour.addMouseListener(this);

        goBackItem.addActionListener(this);
        quitGame.addActionListener(this);
        displayBattleLog.addActionListener(this);
        easyDif.addActionListener(this);
        mediumDif.addActionListener(this);
        hardDif.addActionListener(this);

        gameWindow.setVisible(true);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        //System.out.println(e);
        switch (cmd){
            // move button clicks
            case "attack":
                game.move(0); // set page to attack
                updateUI();
                break;
            case "guard":
                game.move(1); // do guard
                updateUI();
                break;
            case "magic":
                game.move(2); // set page to magic
                updateUI();
                break;
            case "item":
                game.move(3); // set page to item
                updateUI();
                break;
                
            // magic button clicks
            case "magicOne":
                game.magicMoveSelect(0); // magic move one (usually single target magic damage)
                updateUI();
                break;
            case "magicTwo":
                game.magicMoveSelect(1); // magic move two (usually multi target magic damage)
                updateUI();
                break;
            case "magicThree":
                game.magicMoveSelect(2); // magic move three (probably going to be single target physical damage or single target heal)
                updateUI();
                break;
            case "magicFour":
                game.magicMoveSelect(3); // magic move three (probably going to be multi target heal, revive, or something else special)
                updateUI();
                break;   
                
            // items button clicks
            case "itemOne": // oracle lens
                game.typeOfMove = 6; // set type of move to item (6 on enemy single select will mean sweeper)
                game.prevPage = 3;
                game.page = 1; // set page to select enemy
                updateUI();
                break;
            case "itemTwo": // everfrost
                game.typeOfMove = 6; // set type of move to item (item on ally single select will mean everfrost)
                game.prevPage = 3;
                game.page = 4; // set page to select ally
                updateUI();
                break;
            case "itemThree": // lightning crash
                game.typeOfMove = 7; // set type of move to item (7 on enemy single select will mean shock)
                game.prevPage = 3;
                game.page = 1; // set page to select ally
                updateUI();
                break;
            case "itemFour":
                game.cleanse();
                updateUI();
                break;
                
            // single target enemy clicks
            case "enemyOne":
                switch (game.typeOfMove){
                    case 0: // physical
                        game.physical(0);
                        updateUI();
                        break;
                    case 1: // magic
                        game.magic(0);
                        updateUI();
                        break;
                    case 5: // atk down
                        game.debuff(0);
                        updateUI();
                        break;
                    case 6: // sweeper lens
                        game.sweeper(0);
                        updateUI();
                        break;
                    case 7: // lightning crash
                        game.lightningCrash(0);
                        updateUI();
                        break;
                }
                break;
            case "enemyTwo":
                switch (game.typeOfMove){
                    case 0: // physical
                        game.physical(1);
                        updateUI();
                        break;
                    case 1: // magic
                        game.magic(1);
                        updateUI();
                        break;
                    case 5: // atk down
                        game.debuff(1);
                        updateUI();
                        break;
                    case 6: // sweeper lens
                        game.sweeper(1);
                        updateUI();
                        break;
                    case 7: // lightning crash
                        game.lightningCrash(1);
                        updateUI();
                        break;
                }
                break;
            case "enemyThree":
                switch (game.typeOfMove){
                    case 0: // physical
                        game.physical(2);
                        updateUI();
                        break;
                    case 1: // magic
                        game.magic(2);
                        updateUI();
                        break;
                    case 5: // atk down
                        game.debuff(2);
                        updateUI();
                        break;
                    case 6: // sweeper lens
                        game.sweeper(2);
                        updateUI();
                        break;
                    case 7: // lightning crash
                        game.lightningCrash(2);
                        updateUI();
                        break;
                }
                break;
            case "enemyFour":
                switch (game.typeOfMove){
                    case 0: // physical
                        game.physical(3);
                        updateUI();
                        break;
                    case 1: // magic
                        game.magic(3);
                        updateUI();
                        break;
                    case 5: // atk down
                        game.debuff(3);
                        updateUI();
                        break;
                    case 6: // sweeper lens
                        game.sweeper(3);
                        updateUI();
                        break;
                    case 7: // lightning crash
                        game.lightningCrash(3);
                        updateUI();
                        break;
                }
                break;
                
            // single target ally clicks
            case "allyOne":
                switch (game.typeOfMove){
                    case 2: // helaing
                        if (game.hpAlly[0] == game.hpMaxAlly[0]){
                            System.out.println("You cannot heal this character, as they are already on full hp");
                            updateUI();
                        } else if (game.allyDead[0] == 1) {
                            System.out.println("You cannot heal this character, as they are dead");
                        } else {
                            game.healing(0);
                            updateUI();
                        }
                        break;
                    case 3,4,5: // buffs
                        game.boost(0);
                        updateUI();
                        break;
                    case 6: // everfrost
                        game.everfrost(0);
                        updateUI();
                        break;
                    case 7:
                        if (game.allyDead[0] == 1){
                            game.revive(0);
                            updateUI();
                        } else {
                            System.out.println("You cannot revive this character, as they are not dead");
                            updateUI();
                        }
                        break;
                }
                break;
            case "allyTwo":
                switch (game.typeOfMove){
                    case 2: // healing
                        if (game.hpAlly[1] == game.hpMaxAlly[1]){
                            System.out.println("You cannot heal this character, as they are already on full hp");
                            updateUI();
                        } else if (game.allyDead[1] == 1) {
                            System.out.println("You cannot heal this character, as they are dead");
                        } else  {
                            game.healing(1);
                            updateUI();
                        }
                        break;
                    case 3,4,5: // buffs
                        game.boost(1);
                        updateUI();
                        break; 
                    case 6: // everfrost
                        game.everfrost(1);
                        updateUI();
                        break; 
                    case 7:
                        if (game.allyDead[1] == 1){
                            game.revive(1);
                            updateUI();
                        } else {
                            System.out.println("You cannot revive this character, as they are not dead");
                            updateUI();
                        }
                        break;
                }
                break;
            case "allyThree":
                switch (game.typeOfMove){
                    case 2: // healing
                        if (game.hpAlly[2] == game.hpMaxAlly[2]){
                            System.out.println("You cannot heal this character, as they are already on full hp");
                            updateUI();
                        } else if (game.allyDead[2] == 1) {
                            System.out.println("You cannot heal this character, as they are dead");
                        } else  {
                            game.healing(2);
                            updateUI();
                        }
                        break;
                    case 3,4,5: // buffs
                        game.boost(2);
                        updateUI();
                        break;  
                    case 6: // everfrost
                        game.everfrost(2);
                        updateUI();
                        break;
                    case 7:
                        if (game.allyDead[2] == 1){
                            game.revive(2);
                            updateUI();
                        } else {
                            System.out.println("You cannot revive this character, as they are not dead");
                            updateUI();
                        }
                        break;
                }
                break;
            case "allyFour":
                switch (game.typeOfMove){
                    case 2: // healing
                        if (game.hpAlly[3] == game.hpMaxAlly[3]){
                            System.out.println("You cannot heal this character, as they are already on full hp");
                            updateUI();
                        } else if (game.allyDead[3] == 1) {
                            System.out.println("You cannot heal this character, as they are dead");
                        } else  {
                            game.healing(3);
                            updateUI();
                        }
                        break;
                    case 3,4,5: // buffs
                        game.boost(3);
                        updateUI();
                        break;   
                    case 6: // everfrost
                        game.everfrost(3);
                        updateUI();
                        break;    
                    case 7:
                        if (game.allyDead[3] == 1){
                            game.revive(3);
                            updateUI();
                        } else {
                            System.out.println("You cannot revive this character, as they are not dead");
                            updateUI();
                        }
                        break; 
                }
                break;
                
            // multi target spells
            case "allEnemies":
                switch (game.typeOfMove){
                    case 0: // physical
                        System.out.println("physical hit all  move, which if you get here atm means its broken");
                        break;
                    case 1: // magic
                        game.magic(69);
                        updateUI();
                        break;
                }
                break;

            // menu bar clicks
            case "Go Back":
                goBack();
                break;
            case "Quit Game":
                System.exit(0);
                break;
            case "Next Track":
                break;
            case "Previous Track":
                break;
            case "Pause Music":
                break;
            case "Easy":
                game.setDifficulty(0);
                break;
            case "Medium":
                game.setDifficulty(1);
                break;
            case "Hard":
                game.setDifficulty(2);
                break;
            case "Display Battle Log":
                createBattleLog();
                break;
                
            // createStatsMenu("charName", fire, water, air, earth, sun, moon, phys);
            //                    0 = normal, 1 = weak, 2 = resist, 3 = null, 4 = unknown
            case "ameNoUzume":
                createStatsMenu("Ame-No-Uzume", 0, game.allyAffinities[0][0], game.allyAffinities[0][1], game.allyAffinities[0][2], game.allyAffinities[0][3], game.allyAffinities[0][4], game.allyAffinities[0][5], game.allyAffinities[0][6]);
                updateUI();
                break;            
            case "cendrillon":
                createStatsMenu("Cendrillon", 1, game.allyAffinities[1][0], game.allyAffinities[1][1], game.allyAffinities[1][2], game.allyAffinities[1][3], game.allyAffinities[1][4], game.allyAffinities[1][5], game.allyAffinities[1][6]);
                updateUI();
                break;
            case "orpheus":
                createStatsMenu("Orpheus", 2, game.allyAffinities[2][0], game.allyAffinities[2][1], game.allyAffinities[2][2], game.allyAffinities[2][3], game.allyAffinities[2][4], game.allyAffinities[2][5], game.allyAffinities[2][6]);
                updateUI();
                break;
            case "robinHood":
                createStatsMenu("Robin Hood", 3, game.allyAffinities[3][0], game.allyAffinities[3][1], game.allyAffinities[3][2], game.allyAffinities[3][3], game.allyAffinities[3][4], game.allyAffinities[3][5], game.allyAffinities[3][6]);
                updateUI();
                break;
                
            case "archangel":
                if (game.affinitiesKnown[0] == 1) {
                    createStatsMenu("Archangel", 4, game.enemyAffinities[0][0], game.enemyAffinities[0][1], game.enemyAffinities[0][2], game.enemyAffinities[0][3], game.enemyAffinities[0][4], game.enemyAffinities[0][5], game.enemyAffinities[0][6]);
                    updateUI();
                } else {
                    createStatsMenu("Archangel", 4, 4, 4, 4, 4, 4, 4, 4);
                    updateUI();
                }
                break;
            case "jackFrost":
                if (game.affinitiesKnown[1] == 1) {
                    createStatsMenu("Jack Frost", 5, game.enemyAffinities[1][0], game.enemyAffinities[1][1], game.enemyAffinities[1][2], game.enemyAffinities[1][3], game.enemyAffinities[1][4], game.enemyAffinities[1][5], game.enemyAffinities[1][6]);
                    updateUI();
                } else {
                    createStatsMenu("Jack Frost", 5, 4, 4, 4, 4, 4, 4, 4);
                    updateUI();
                }
                break;
            case "legion":
                if (game.affinitiesKnown[2] == 1) {
                    createStatsMenu("Legion", 6, game.enemyAffinities[2][0], game.enemyAffinities[2][1], game.enemyAffinities[2][2], game.enemyAffinities[2][3], game.enemyAffinities[2][4], game.enemyAffinities[2][5], game.enemyAffinities[2][6]);
                    updateUI();
                } else {
                    createStatsMenu("Legion", 6, 4, 4, 4, 4, 4, 4, 4);
                    updateUI();
                }
                break;
            case "principality":
                if (game.affinitiesKnown[3] == 1) {
                    createStatsMenu("Principality", 7, game.enemyAffinities[3][0], game.enemyAffinities[3][1], game.enemyAffinities[3][2], game.enemyAffinities[3][3], game.enemyAffinities[3][4], game.enemyAffinities[3][5], game.enemyAffinities[3][6]);
                    updateUI();
                } else {
                    createStatsMenu("Principality", 7, 4, 4, 4, 4, 4, 4, 4);
                    updateUI();
                }
                break;
        }
        jRequestFocus();
    }

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        //System.out.println(keyCode);
        switch (game.page){ // what menu are we in
            case 0,1,2,3,4,5,6: // if main page
                switch (keyCode){
                    case 37: // left arrow in main page
                        if (game.selected == 0){
                            game.selected = 0;
                        } else {
                            game.selected--;
                        }
                        updateUI();
                        break;
                    case 39: // right arrow in main page
                        if (game.selected == 3){
                            game.selected = 3;
                        } else {
                            game.selected++;
                        }
                        updateUI();
                        break;
                    case 90: // if z key pressed
                        if (game.turn == 0){
                            switch (game.selected){
                                case 0:
                                    moveButtonOne.doClick();
                                    break;
                                case 1:
                                    moveButtonTwo.doClick();
                                    break;
                                case 2:
                                    moveButtonThree.doClick();
                                    break;
                                case 3:
                                    moveButtonFour.doClick();
                                    break;
                            }
                        }
                        break;
                }
                break;
        }
        
        if (keyCode == 27){
            goBack();
        }
        
        /*
        if (keyCode == 84){
            game.goNext();
            updateUI();
        }
        */
    }    
    
    void goBack(){
        if (game.page == 2 || game.page == 3){
            game.page = 0;
        } else {
            game.page = game.prevPage;
        }
        updateUI();
    }
    
    void createStatsMenu(String name, int character, int one, int two, int three, int four, int five, int six, int seven){
        JDialog box = new JDialog(this);
        box.setTitle(name + " stats");
        box.setBounds(200,400, 800, 200);
        box.setLayout(new GridLayout(2, 8, 20, 20));
        box.setResizable(false);

        JLabel nameLabel = new JLabel(name);
        switch (character){
            case 0:
                box.add(img.ameNoUzume);
                break;
            case 1:
                box.add(img.cendrillon);
                break;
            case 2:
                box.add(img.orpheus);
                break;
            case 3:
                box.add(img.robinHood);
                break;
            case 4:
                box.add(img.archangel);
                break;
            case 5:
                box.add(img.jackFrost);
                break;
            case 6:
                box.add(img.legion);
                break;
            case 7:
                box.add(img.principality);
                break;
        }
        box.add(img.elementOne); // 1
        box.add(img.elementTwo); // 2
        box.add(img.elementThree); // 3
        box.add(img.elementFour); // 4
        box.add(img.elementFive); // 5
        box.add(img.elementSix); // 6
        box.add(img.elementSeven); // 7

        box.add(nameLabel); // adding name to the bottom row
        switch (one){
            case 0: // normal
                img.affinityOne.setIcon(img.normal);
                break;
            case 1: // weak
                img.affinityOne.setIcon(img.weak);
                break;
            case 2: // null
                img.affinityOne.setIcon(img.resist);
                break;
            case 3: // resist
                img.affinityOne.setIcon(img.nullify);
                break;
            case 4: // unknown
                img.affinityOne.setIcon(img.unknown);
                break;
        }
        switch (two){
            case 0: // normal
                img.affinityTwo.setIcon(img.normal);
                break;
            case 1: // weak
                img.affinityTwo.setIcon(img.weak);
                break;
            case 2: // null
                img.affinityTwo.setIcon(img.resist);
                break;
            case 3: // resist
                img.affinityTwo.setIcon(img.nullify);
                break;
            case 4: // unknown
                img.affinityTwo.setIcon(img.unknown);
                break;
        }
        switch (three){
            case 0: // normal
                img.affinityThree.setIcon(img.normal);
                break;
            case 1: // weak
                img.affinityThree.setIcon(img.weak);
                break;
            case 2: // null
                img.affinityThree.setIcon(img.resist);
                break;
            case 3: // resist
                img.affinityThree.setIcon(img.nullify);
                break;
            case 4: // unknown
                img.affinityThree.setIcon(img.unknown);
                break;
        }
        switch (four){
            case 0: // normal
                img.affinityFour.setIcon(img.normal);
                break;
            case 1: // weak
                img.affinityFour.setIcon(img.weak);
                break;
            case 2: // null
                img.affinityFour.setIcon(img.resist);
                break;
            case 3: // resist
                img.affinityFour.setIcon(img.nullify);
                break;
            case 4: // unknown
                img.affinityFour.setIcon(img.unknown);
                break;
        }
        switch (five){
            case 0: // normal
                img.affinityFive.setIcon(img.normal);
                break;
            case 1: // weak
                img.affinityFive.setIcon(img.weak);
                break;
            case 2: // null
                img.affinityFive.setIcon(img.resist);
                break;
            case 3: // resist
                img.affinityFive.setIcon(img.nullify);
                break;
            case 4: // unknown
                img.affinityFive.setIcon(img.unknown);
                break;
        }
        switch (six){
            case 0: // normal
                img.affinitySix.setIcon(img.normal);
                break;
            case 1: // weak
                img.affinitySix.setIcon(img.weak);
                break;
            case 2: // null
                img.affinitySix.setIcon(img.resist);
                break;
            case 3: // resist
                img.affinitySix.setIcon(img.nullify);
                break;
            case 4: // unknown
                img.affinitySix.setIcon(img.unknown);
                break;
        }
        switch (seven){
            case 0: // normal
                img.affinitySeven.setIcon(img.normal);
                break;
            case 1: // weak
                img.affinitySeven.setIcon(img.weak);
                break;
            case 2: // null
                img.affinitySeven.setIcon(img.resist);
                break;
            case 3: // resist
                img.affinitySeven.setIcon(img.nullify);
                break;
            case 4: // unknown
                img.affinitySeven.setIcon(img.unknown);
                break;
        }
        
        box.add(img.affinityOne);
        box.add(img.affinityTwo);
        box.add(img.affinityThree);
        box.add(img.affinityFour);
        box.add(img.affinityFive);
        box.add(img.affinitySix);
        box.add(img.affinitySeven);
        
        box.toFront();
        box.setVisible(true);
    }

    public void createBattleLog(){
        JDialog box = new JDialog(this);
        box.setTitle("Battle Log");
        String a;
        String b;
        a = "0: " + game.textHistory.get(0) + " \n";
        for (int i = 1; i < game.textHistory.size(); i++){
            b = game.textHistory.get(i);
            b = i + ": " + b + " \n";
            a = a + b;
        }
        TextArea area = new TextArea(a);
        box.add(area);
        box.setBounds(400,200, 400,400);
        box.toFront();
        box.setVisible(true);
    }

    public void keyReleased(KeyEvent e){}

    public void keyTyped(KeyEvent e){}

    public void mouseEntered(MouseEvent e){
        int hover = e.getXOnScreen();
        if (game.page == 0){
            if (hover > 263 && hover < 518){ //button one
                game.selected = 0;
            } else if (hover > 519 && hover < 774) {// button two
                game.selected = 1;
            } else if (hover > 775 && hover < 1030){ // button 3
                game.selected = 2;
            } else if (hover > 1031 && hover < 1285){ // button 4
                game.selected = 3;
            }
        } else {
            if (hover > 263 && hover < 518){ //button one
                game.selected = 0;
            } else if (hover > 519 && hover < 774) {// button two
                game.selected = 1;
            } else if (hover > 775 && hover < 1030){ // button 3
                game.selected = 2;
            } else if (hover > 1031 && hover < 1285){ // button 4
                game.selected = 3;
            } else if (hover < 263){ // back button on pages that can go back 
                game.selected = 4;
            }
        }
        updateUI();
    }

    public void mouseExited(MouseEvent e){}

    public void mousePressed(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}

    public void mouseClicked(MouseEvent e){}
    
    public void displayStatus(int target, int status){ // 0 = weak, 1 = resist, 2 = null
        if (!game.targetAll){ // if not targetting all, clear before 
            clearAffinity();
        } // displaying stats
        switch (target){
            case 0: // enemy one
                switch (status){
                    case 0:
                        img.enemyOneAffinity.setIcon(img.weakOverlay);
                        break;
                    case 1:
                        img.enemyOneAffinity.setIcon(img.resistOverlay);
                        break;
                    case 2:
                        img.enemyOneAffinity.setIcon(img.nullOverlay);
                        break;
                    case 3:
                        img.enemyOneAffinity.setIcon(img.normalOverlay);
                        break;
                    case 4:
                        img.enemyOneAffinity.setIcon(img.healed);
                        break;
                    case 5:
                        img.enemyOneAffinity.setIcon(img.buffed);
                        break;
                    case 6:
                        img.enemyOneAffinity.setIcon(img.debuffed);
                        break;
                }
                break;
            case 1: // enemy two
                switch (status){
                    case 0:
                        img.enemyTwoAffinity.setIcon(img.weakOverlay);
                        break;
                    case 1:
                        img.enemyTwoAffinity.setIcon(img.resistOverlay);
                        break;
                    case 2:
                        img.enemyTwoAffinity.setIcon(img.nullOverlay);
                        break;
                    case 3:
                        img.enemyTwoAffinity.setIcon(img.normalOverlay);
                        break;
                    case 4:
                        img.enemyTwoAffinity.setIcon(img.healed);
                        break;
                    case 5:
                        img.enemyTwoAffinity.setIcon(img.buffed);
                        break;
                    case 6:
                        img.enemyTwoAffinity.setIcon(img.debuffed);
                        break;
                }
                break;
            case 2: // enemy three
                switch (status){
                    case 0:
                        img.enemyThreeAffinity.setIcon(img.weakOverlay);
                        break;
                    case 1:
                        img.enemyThreeAffinity.setIcon(img.resistOverlay);
                        break;
                    case 2:
                        img.enemyThreeAffinity.setIcon(img.nullOverlay);
                        break;
                    case 3:
                        img.enemyThreeAffinity.setIcon(img.normalOverlay);
                        break;
                    case 4:
                        img.enemyThreeAffinity.setIcon(img.healed);
                        break;
                    case 5:
                        img.enemyThreeAffinity.setIcon(img.buffed);
                        break;
                    case 6:
                        img.enemyThreeAffinity.setIcon(img.debuffed);
                        break;
                }
                break;
            case 3: // enemy four
                switch (status){
                    case 0:
                        img.enemyFourAffinity.setIcon(img.weakOverlay);
                        break;
                    case 1:
                        img.enemyFourAffinity.setIcon(img.resistOverlay);
                        break;
                    case 2:
                        img.enemyFourAffinity.setIcon(img.nullOverlay);
                        break;
                    case 3:
                        img.enemyFourAffinity.setIcon(img.normalOverlay);
                        break;
                    case 4:
                        img.enemyFourAffinity.setIcon(img.healed);
                        break;
                    case 5:
                        img.enemyFourAffinity.setIcon(img.buffed);
                        break;
                    case 6:
                        img.enemyFourAffinity.setIcon(img.debuffed);
                        break;
                }
                break;
            case 4: // allyOne
                switch (status){
                    case 0:
                        img.allyOneAffinity.setIcon(img.weakOverlay);
                        break;
                    case 1:
                        img.allyOneAffinity.setIcon(img.resistOverlay);
                        break;
                    case 2:
                        img.allyOneAffinity.setIcon(img.nullOverlay);
                        break;
                    case 3:
                        img.allyOneAffinity.setIcon(img.normalOverlay);
                        break;
                    case 4:
                        img.allyOneAffinity.setIcon(img.healed);
                        break;
                    case 5:
                        img.allyOneAffinity.setIcon(img.buffed);
                        break;
                    case 6:
                        img.allyOneAffinity.setIcon(img.debuffed);
                        break;
                    case 7:
                        img.allyOneAffinity.setIcon(img.guard);
                        break;
                }
                break;
            case 5: // ally two
                switch (status){
                    case 0:
                        img.allyTwoAffinity.setIcon(img.weakOverlay);
                        break;
                    case 1:
                        img.allyTwoAffinity.setIcon(img.resistOverlay);
                        break;
                    case 2:
                        img.allyTwoAffinity.setIcon(img.nullOverlay);
                        break;
                    case 3:
                        img.allyTwoAffinity.setIcon(img.normalOverlay);
                        break;
                    case 4:
                        img.allyTwoAffinity.setIcon(img.healed);
                        break;
                    case 5:
                        img.allyTwoAffinity.setIcon(img.buffed);
                        break;
                    case 6:
                        img.allyTwoAffinity.setIcon(img.debuffed);
                        break;
                    case 7:
                        img.allyTwoAffinity.setIcon(img.guard);
                        break;
                }
                break;
            case 6: // ally three
                switch (status){
                    case 0:
                        img.allyThreeAffinity.setIcon(img.weakOverlay);
                        break;
                    case 1:
                        img.allyThreeAffinity.setIcon(img.resistOverlay);
                        break;
                    case 2:
                        img.allyThreeAffinity.setIcon(img.nullOverlay);
                        break;
                    case 3:
                        img.allyThreeAffinity.setIcon(img.normalOverlay);
                        break;
                    case 4:
                        img.allyThreeAffinity.setIcon(img.healed);
                        break;
                    case 5:
                        img.allyThreeAffinity.setIcon(img.buffed);
                        break;
                    case 6:
                        img.allyThreeAffinity.setIcon(img.debuffed);
                        break;
                    case 7:
                        img.allyThreeAffinity.setIcon(img.guard);
                        break;
                }
                break;
            case 7: // ally four
                switch (status){
                    case 0:
                        img.allyFourAffinity.setIcon(img.weakOverlay);
                        break;
                    case 1:
                        img.allyFourAffinity.setIcon(img.resistOverlay);
                        break;
                    case 2:
                        img.allyFourAffinity.setIcon(img.nullOverlay);
                        break;
                    case 3:
                        img.allyFourAffinity.setIcon(img.normalOverlay);
                        break;
                    case 4:
                        img.allyFourAffinity.setIcon(img.healed);
                        break;
                    case 5:
                        img.allyFourAffinity.setIcon(img.buffed);
                        break;
                    case 6:
                        img.allyFourAffinity.setIcon(img.debuffed);
                        break;
                    case 7:
                        img.allyFourAffinity.setIcon(img.guard);
                        break;
                }
                break;
        }
    }    
    
    void setMenu(){
        this.setJMenuBar(menuBar);
        menuBar.add(system);
        menuBar.add(difficulty);
        menuBar.add(battleLog);

        system.add(goBackItem);
        system.add(quitGame);

        difficulty.add(easyDif);
        difficulty.add(mediumDif);
        difficulty.add(hardDif);

        battleLog.add(displayBattleLog);
    }

    void setImages(){
        allyOneButton.setIcon(img.ameNoUzumeIMG);
        allyTwoButton.setIcon(img.cendrillonIMG);
        allyThreeButton.setIcon(img.orpheusIMG);
        allyFourButton.setIcon(img.robinHoodIMG);
        enemyOneButton.setIcon(img.archangelIMG);
        enemyTwoButton.setIcon(img.jackFrostIMG);
        enemyThreeButton.setIcon(img.legionIMG);
        enemyFourButton.setIcon(img.principalityIMG);
    }
    
    void cleanUp(){
        // enemy window adding variables
        enemyOneHPText.setForeground(Color.white);
        enemyTwoHPText.setForeground(Color.white);
        enemyThreeHPText.setForeground(Color.white);
        enemyFourHPText.setForeground(Color.white);
        allyOneHPText.setForeground(Color.white);
        allyTwoHPText.setForeground(Color.white);
        allyThreeHPText.setForeground(Color.white);
        allyFourHPText.setForeground(Color.white);
        allyOneSPText.setForeground(Color.white);
        allyTwoSPText.setForeground(Color.white);
        allyThreeSPText.setForeground(Color.white);
        allyFourSPText.setForeground(Color.white);
        enemyWindowBase.add(enemyOneButton);
        enemyWindowBase.add(enemyOneHPText);
        enemyWindowBase.add(enemyTwoButton);
        enemyWindowBase.add(enemyTwoHPText);
        enemyWindowBase.add(enemyThreeButton);
        enemyWindowBase.add(enemyThreeHPText);
        enemyWindowBase.add(enemyFourButton);
        enemyWindowBase.add(enemyFourHPText);
        
        // ally window adding variables
        allyWindowBase.add(allyOneButton);
        allyWindowBase.add(allyOneHPText);
        allyWindowBase.add(allyOneSPText);
        allyWindowBase.add(allyTwoButton);
        allyWindowBase.add(allyTwoHPText);
        allyWindowBase.add(allyTwoSPText);
        allyWindowBase.add(allyThreeButton);
        allyWindowBase.add(allyThreeHPText);
        allyWindowBase.add(allyThreeSPText);
        allyWindowBase.add(allyFourButton);
        allyWindowBase.add(allyFourHPText);
        allyWindowBase.add(allyFourSPText);
        
        // game window adding variables
        gameWindowDead.add(img.deadOverlay1);
        gameWindowDead.add(img.deadOverlay2);
        gameWindowDead.add(img.deadOverlay3);
        gameWindowDead.add(img.deadOverlay4);
        gameWindowDead.add(img.filler17);
        gameWindowDead.add(img.filler18);
        gameWindowDead.add(img.filler19);
        gameWindowDead.add(img.filler20);
        gameWindowDead.add(img.deadOverlay5);
        gameWindowDead.add(img.deadOverlay6);
        gameWindowDead.add(img.deadOverlay7);
        gameWindowDead.add(img.deadOverlay8);
        
        gameWindowStats.add(img.statOverlay1);
        gameWindowStats.add(img.statOverlay2);
        gameWindowStats.add(img.statOverlay3);
        gameWindowStats.add(img.statOverlay4);
        gameWindowStats.add(img.filler1);
        gameWindowStats.add(img.filler2);
        gameWindowStats.add(img.filler3);
        gameWindowStats.add(img.filler4);
        gameWindowStats.add(img.statOverlay5);
        gameWindowStats.add(img.statOverlay6);
        gameWindowStats.add(img.statOverlay7);
        gameWindowStats.add(img.statOverlay8);
        
        gameWindowAttack.add(img.attackOverlay1);
        gameWindowAttack.add(img.attackOverlay2);
        gameWindowAttack.add(img.attackOverlay3);
        gameWindowAttack.add(img.attackOverlay4);
        gameWindowAttack.add(img.filler5);
        gameWindowAttack.add(img.filler6);
        gameWindowAttack.add(img.filler7);
        gameWindowAttack.add(img.filler8);
        gameWindowAttack.add(img.attackOverlay5);
        gameWindowAttack.add(img.attackOverlay6);
        gameWindowAttack.add(img.attackOverlay7);
        gameWindowAttack.add(img.attackOverlay8);
        
        gameWindowDefense.add(img.defenseOverlay1);
        gameWindowDefense.add(img.defenseOverlay2);
        gameWindowDefense.add(img.defenseOverlay3);
        gameWindowDefense.add(img.defenseOverlay4);
        gameWindowDefense.add(img.filler9);
        gameWindowDefense.add(img.filler10);
        gameWindowDefense.add(img.filler11);
        gameWindowDefense.add(img.filler12);
        gameWindowDefense.add(img.defenseOverlay5);
        gameWindowDefense.add(img.defenseOverlay6);
        gameWindowDefense.add(img.defenseOverlay7);
        gameWindowDefense.add(img.defenseOverlay8);
        
        gameWindowBase.add(enemyOneSprite);
        gameWindowBase.add(enemyTwoSprite);
        gameWindowBase.add(enemyThreeSprite);
        gameWindowBase.add(enemyFourSprite);
        gameWindowBase.add(img.turnIndicatorOne);
        gameWindowBase.add(img.turnIndicatorTwo);
        gameWindowBase.add(img.turnIndicatorThree);
        gameWindowBase.add(img.turnIndicatorFour);
        gameWindowBase.add(allyOneSprite);
        gameWindowBase.add(allyTwoSprite);
        gameWindowBase.add(allyThreeSprite);
        gameWindowBase.add(allyFourSprite);
        
        gameWindowAffinities.add(img.enemyOneAffinity);
        gameWindowAffinities.add(img.enemyTwoAffinity);
        gameWindowAffinities.add(img.enemyThreeAffinity);
        gameWindowAffinities.add(img.enemyFourAffinity);
        gameWindowAffinities.add(img.blankOne);
        gameWindowAffinities.add(img.blankTwo);
        gameWindowAffinities.add(img.blankThree);
        gameWindowAffinities.add(img.blankFour);
        gameWindowAffinities.add(img.allyOneAffinity);
        gameWindowAffinities.add(img.allyTwoAffinity);
        gameWindowAffinities.add(img.allyThreeAffinity);
        gameWindowAffinities.add(img.allyFourAffinity);
        
        // setting backgrounds
        allyWindowBackgroundPanel.add(allyWindowBackground);
        allyWindowBackground.setIcon(img.allyPanel);
        
        enemyWindowBackgroundPanel.add(enemyWindowBackground);
        enemyWindowBackground.setIcon(img.enemyPanel);
        
        gameWindowBackgroundPanel.add(gameWindowBackground);
        gameWindowBackground.setIcon(img.gamePanel);
        
        // setting opaque
        allyOneButton.setOpaque(false);
        allyOneButton.setContentAreaFilled(false);
        allyOneButton.setBorderPainted(false);
        allyTwoButton.setOpaque(false);
        allyTwoButton.setContentAreaFilled(false);
        allyTwoButton.setBorderPainted(false);
        allyThreeButton.setOpaque(false);
        allyThreeButton.setContentAreaFilled(false);
        allyThreeButton.setBorderPainted(false);
        allyFourButton.setOpaque(false);
        allyFourButton.setContentAreaFilled(false);
        allyFourButton.setBorderPainted(false);
        allyOneButton.setOpaque(false);
        enemyOneButton.setContentAreaFilled(false);
        enemyOneButton.setBorderPainted(false);
        enemyTwoButton.setOpaque(false);
        enemyTwoButton.setContentAreaFilled(false);
        enemyTwoButton.setBorderPainted(false);
        enemyThreeButton.setOpaque(false);
        enemyThreeButton.setContentAreaFilled(false);
        enemyThreeButton.setBorderPainted(false);
        enemyFourButton.setOpaque(false);
        enemyFourButton.setContentAreaFilled(false);
        enemyFourButton.setBorderPainted(false);
        enemyWindowBase.setOpaque(false);
        allyWindowBase.setOpaque(false);
        allyWindowBackground.setOpaque(false);
        gameWindowBase.setOpaque(false);
        gameWindowDead.setOpaque(false);
        gameWindowStats.setOpaque(false);
        gameWindowAttack.setOpaque(false);
        gameWindowDefense.setOpaque(false);
        gameWindowAffinities.setOpaque(false);
        gameWindowBackgroundPanel.setOpaque(false);
    }
}