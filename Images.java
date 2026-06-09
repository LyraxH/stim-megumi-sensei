/**
 * Who:
 *      ts (Taison Shea, Sheata, whatever else you want to call me)
 * What:
 *      This script holds all the images. While the window will decide what goes where
 *      this decides and declares what is what
 * When:
 *      08/04/24 -> 02/08/24
 * Where:
 *      Wellington High School Com labs or at my house in Karori
 * Why:
 *      Because school wanted a project, and I wanted credits
 * How:
 *      With a bit of ease. It started difficult actually as I struggled with how to declare images and find the difference between iamge icon
 *      set icon, set label, jlabel and all that, but we got there in the end
 */
import javax.swing.*;
import java.awt.*;
public class Images
{
    ImageIcon LOGO = new ImageIcon("stimMegumiSensei.png");
    // hud moves
    ImageIcon unAttackIcon = new ImageIcon("stim-megumi-sensei/buttons/unselectedAttack.png");
    ImageIcon unGuardIcon = new ImageIcon("stim-megumi-sensei/buttons/unselectedGuard.png");
    ImageIcon unMagicIcon = new ImageIcon("stim-megumi-sensei/buttons/unselectedMagic.png");
    ImageIcon unItemIcon = new ImageIcon("stim-megumi-sensei/buttons/unselectedItem.png");
    
    ImageIcon attackIcon = new ImageIcon("stim-megumi-sensei/buttons/selectedAttack.png");
    ImageIcon guardIcon = new ImageIcon("stim-megumi-sensei/buttons/selectedGuard.png");
    ImageIcon magicIcon = new ImageIcon("stim-megumi-sensei/buttons/selectedMagic.png");
    ImageIcon itemIcon = new ImageIcon("stim-megumi-sensei/buttons/selectedItem.png");
    
    // allies
    ImageIcon aegisIMG = new ImageIcon("stim-megumi-sensei/sprites/aegis.png");
    ImageIcon dawnIMG = new ImageIcon("stim-megumi-sensei/sprites/dawn.png");
    ImageIcon sentinelIMG = new ImageIcon("stim-megumi-sensei/sprites/sentinel.png");
    ImageIcon blazeIMG = new ImageIcon("stim-megumi-sensei/sprites/blaze.png");
    //turning allies into jlabels
    JLabel aegis = new JLabel(aegisIMG);
    JLabel dawn = new JLabel(dawnIMG);
    JLabel sentinel = new JLabel(sentinelIMG);
    JLabel blaze = new JLabel(blazeIMG);
    
    // enemies
    ImageIcon virtueIMG = new ImageIcon("stim-megumi-sensei/sprites/virtue1.png");
    ImageIcon eerieIMG = new ImageIcon("stim-megumi-sensei/sprites/eerie.png");
    ImageIcon soulIMG = new ImageIcon("stim-megumi-sensei/sprites/soul.png");
    ImageIcon reignIMG = new ImageIcon("stim-megumi-sensei/sprites/reign.png");
    // turning enemies into jlabels
    JLabel virtue = new JLabel(virtueIMG);
    JLabel eerie = new JLabel(eerieIMG);
    JLabel soul = new JLabel(soulIMG);
    JLabel reign = new JLabel(reignIMG);
    
    // panels/backgronds
    ImageIcon allyPanel = new ImageIcon("stim-megumi-sensei/panels/allyPanel14.png");
    ImageIcon gamePanel = new ImageIcon("stim-megumi-sensei/panels/gamepanel.png");
    ImageIcon enemyPanel = new ImageIcon("stim-megumi-sensei/panels/enemyPanel14.png");
    
    //sprites
    ImageIcon aegisSelected = new ImageIcon("stim-megumi-sensei/sprites/aegisSelected.png");
    ImageIcon dawnSelected = new ImageIcon("stim-megumi-sensei/sprites/dawnSelected.png");
    ImageIcon sentinelSelected = new ImageIcon("stim-megumi-sensei/sprites/sentinelSelected.png");
    ImageIcon blazeSelected = new ImageIcon("stim-megumi-sensei/sprites/blazeSelected.png");
    ImageIcon virtueSelected = new ImageIcon("stim-megumi-sensei/sprites/virtueSelected1.png");
    ImageIcon eerieSelected = new ImageIcon("stim-megumi-sensei/sprites/eerieSelected.png");
    ImageIcon soulSelected = new ImageIcon("stim-megumi-sensei/sprites/soulSelected.png");
    ImageIcon reignSelected = new ImageIcon("stim-megumi-sensei/sprites/reignSelected.png");
    ImageIcon playerTurnOne = new ImageIcon("stim-megumi-sensei/sprites/playerTurnOne.png");
    ImageIcon playerTurnTwo = new ImageIcon("stim-megumi-sensei/sprites/playerTurnTwo.png");
    ImageIcon playerTurnThree = new ImageIcon("stim-megumi-sensei/sprites/playerTurnThree.png");
    ImageIcon playerTurnFour = new ImageIcon("stim-megumi-sensei/sprites/playerTurnFour.png");
    ImageIcon enemyTurnOne = new ImageIcon("stim-megumi-sensei/sprites/enemyTurnOne.png");
    ImageIcon enemyTurnTwo = new ImageIcon("stim-megumi-sensei/sprites/enemyTurnTwo.png");
    ImageIcon enemyTurnThree = new ImageIcon("stim-megumi-sensei/sprites/enemyTurnThree.png");
    ImageIcon enemyTurnFour = new ImageIcon("stim-megumi-sensei/sprites/enemyTurnFour.png");
    ImageIcon youLoseOne = new ImageIcon("stim-megumi-sensei/sprites/youLoseOne2.png");
    ImageIcon youLoseTwo = new ImageIcon("stim-megumi-sensei/sprites/youLoseTwo2.png");
    ImageIcon youLoseThree = new ImageIcon("stim-megumi-sensei/sprites/youLoseThree2.png");
    ImageIcon youLoseFour = new ImageIcon("stim-megumi-sensei/sprites/youLoseFour2.png");
    ImageIcon youWinOne = new ImageIcon("stim-megumi-sensei/sprites/youWinOne.png");
    ImageIcon youWinTwo = new ImageIcon("stim-megumi-sensei/sprites/youWinTwo.png");
    ImageIcon youWinThree = new ImageIcon("stim-megumi-sensei/sprites/youWinThree.png");
    ImageIcon youWinFour = new ImageIcon("stim-megumi-sensei/sprites/youWinFour.png");
    ///
    ImageIcon warningLeft = new ImageIcon("stim-megumi-sensei/sprites/warnings/left.png");
    ImageIcon warningRight = new ImageIcon("stim-megumi-sensei/sprites/warnings/right.png");
    ImageIcon affinitiesRevealed1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/affinitiesRevealed1.png");
    ImageIcon affinitiesRevealed2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/affinitiesRevealed2.png");
    ImageIcon fullHP1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/fullHP1.png");
    ImageIcon fullHP2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/fullHP2.png");
    ImageIcon isAlive1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/isAlive1.png");
    ImageIcon isAlive2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/isAlive2.png");
    ImageIcon isDead1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/isDead1.png");
    ImageIcon isDead2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/isDead2.png");
    ImageIcon maxSP1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/maxSP1.png");
    ImageIcon maxSP2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/maxSP2.png");
    ImageIcon noHP1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noHP1.png");
    ImageIcon noHP2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noHP2.png");
    ImageIcon noInjured1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noInjured1.png");
    ImageIcon noInjured2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noInjured2.png");
    ImageIcon noOneDead1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noOneDead1.png");
    ImageIcon noOneDead2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noOneDead2.png");
    ImageIcon noSP1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noSP1.png");
    ImageIcon noSP2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noSP2.png");
    ImageIcon noBoost1 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noBoost1.png");
    ImageIcon noBoost2 = new ImageIcon("stim-megumi-sensei/sprites/warnings/noBoost2.png");
    JLabel turnIndicatorOne = new JLabel(playerTurnOne);
    JLabel turnIndicatorTwo = new JLabel(playerTurnTwo);
    JLabel turnIndicatorThree = new JLabel(playerTurnThree);
    JLabel turnIndicatorFour = new JLabel(playerTurnFour);
    
    // elements and affinities
    ImageIcon fire = new ImageIcon("stim-megumi-sensei/elements/fire3.png");
    ImageIcon water = new ImageIcon("stim-megumi-sensei/elements/water3.png");
    ImageIcon air = new ImageIcon("stim-megumi-sensei/elements/air3.png");
    ImageIcon earth = new ImageIcon("stim-megumi-sensei/elements/earth3.png");
    ImageIcon sun = new ImageIcon("stim-megumi-sensei/elements/sun3.png");
    ImageIcon moon = new ImageIcon("stim-megumi-sensei/elements/moon3.png");
    ImageIcon phys = new ImageIcon("stim-megumi-sensei/elements/phys3.png");
    ImageIcon weak = new ImageIcon("stim-megumi-sensei/elements/weak3.png");
    ImageIcon resist = new ImageIcon("stim-megumi-sensei/elements/resist3.png");
    ImageIcon nullify = new ImageIcon("stim-megumi-sensei/elements/nullify3.png");
    ImageIcon normal = new ImageIcon("stim-megumi-sensei/elements/normal3.png");
    ImageIcon unknown = new ImageIcon("stim-megumi-sensei/elements/unknown.png");
    JLabel elementOne = new JLabel(fire);
    JLabel elementTwo = new JLabel(water);
    JLabel elementThree = new JLabel(air);
    JLabel elementFour = new JLabel(earth);
    JLabel elementFive = new JLabel(sun);
    JLabel elementSix = new JLabel(moon);
    JLabel elementSeven = new JLabel(phys);
    JLabel affinityOne = new JLabel(unknown);
    JLabel affinityTwo = new JLabel(unknown);
    JLabel affinityThree = new JLabel(unknown);
    JLabel affinityFour = new JLabel(unknown);
    JLabel affinityFive = new JLabel(unknown);
    JLabel affinitySix = new JLabel(unknown);
    JLabel affinitySeven = new JLabel(unknown);
    
    // game window overlay affinity weakness hitting notice thing
    ImageIcon weakOverlay = new ImageIcon("stim-megumi-sensei/elements/popUpWeak.png");
    ImageIcon resistOverlay = new ImageIcon("stim-megumi-sensei/elements/popUpResist.png");
    ImageIcon nullOverlay = new ImageIcon("stim-megumi-sensei/elements/popUpNull.png");
    ImageIcon normalOverlay = new ImageIcon("stim-megumi-sensei/elements/popUphit.png");
    ImageIcon dead = new ImageIcon("stim-megumi-sensei/elements/dead3.png");
    ImageIcon test = new ImageIcon("stim-megumi-sensei/elements/test.png");
    JLabel enemyOneAffinity = new JLabel();
    JLabel enemyTwoAffinity = new JLabel();
    JLabel enemyThreeAffinity = new JLabel();
    JLabel enemyFourAffinity = new JLabel();    
    JLabel blankOne = new JLabel();
    JLabel blankTwo = new JLabel();
    JLabel blankThree = new JLabel();
    JLabel blankFour = new JLabel();
    JLabel allyOneAffinity = new JLabel();
    JLabel allyTwoAffinity = new JLabel();
    JLabel allyThreeAffinity = new JLabel();
    JLabel allyFourAffinity = new JLabel();
    
    // stat changes overlays
    ImageIcon statOverlay = new ImageIcon("stim-megumi-sensei/overlayBuffs/statsOverlay2.png");
    ImageIcon atkUp = new ImageIcon("stim-megumi-sensei/overlayBuffs/attackUp.png");
    ImageIcon atkNorm = new ImageIcon("stim-megumi-sensei/overlayBuffs/attackNormal2.png");
    ImageIcon atkDown = new ImageIcon("stim-megumi-sensei/overlayBuffs/attackDown.png");
    ImageIcon defUp = new ImageIcon("stim-megumi-sensei/overlayBuffs/defenseUp.png");
    ImageIcon defNorm = new ImageIcon("stim-megumi-sensei/overlayBuffs/defenseNormal2.png");
    ImageIcon defDown = new ImageIcon("stim-megumi-sensei/overlayBuffs/defenseDown.png");
    ImageIcon guard = new ImageIcon("stim-megumi-sensei/overlayBuffs/guard.png");
    ImageIcon healed = new ImageIcon("stim-megumi-sensei/overlayBuffs/healed.png");
    ImageIcon buffed = new ImageIcon("stim-megumi-sensei/overlayBuffs/buffed.png");
    ImageIcon debuffed = new ImageIcon("stim-megumi-sensei/overlayBuffs/debuffed.png");
    JLabel filler1 = new JLabel();
    JLabel filler2 = new JLabel();
    JLabel filler3 = new JLabel();
    JLabel filler4 = new JLabel();
    JLabel filler5 = new JLabel();
    JLabel filler6 = new JLabel();
    JLabel filler7 = new JLabel();
    JLabel filler8 = new JLabel();
    JLabel filler9 = new JLabel();
    JLabel filler10 = new JLabel();
    JLabel filler11 = new JLabel();
    JLabel filler12 = new JLabel();
    JLabel filler17 = new JLabel();
    JLabel filler18 = new JLabel();
    JLabel filler19 = new JLabel();
    JLabel filler20 = new JLabel();
    JLabel deadOverlay1 = new JLabel();
    JLabel deadOverlay2 = new JLabel();
    JLabel deadOverlay3 = new JLabel();
    JLabel deadOverlay4 = new JLabel();
    JLabel deadOverlay5 = new JLabel();
    JLabel deadOverlay6 = new JLabel();
    JLabel deadOverlay7 = new JLabel();
    JLabel deadOverlay8 = new JLabel();
    JLabel statOverlay1 = new JLabel(statOverlay);
    JLabel statOverlay2 = new JLabel(statOverlay);
    JLabel statOverlay3 = new JLabel(statOverlay);
    JLabel statOverlay4 = new JLabel(statOverlay);
    JLabel statOverlay5 = new JLabel(statOverlay);
    JLabel statOverlay6 = new JLabel(statOverlay);
    JLabel statOverlay7 = new JLabel(statOverlay);
    JLabel statOverlay8 = new JLabel(statOverlay);
    JLabel attackOverlay1 = new JLabel(atkNorm);
    JLabel attackOverlay2 = new JLabel(atkNorm);
    JLabel attackOverlay3 = new JLabel(atkNorm);
    JLabel attackOverlay4 = new JLabel(atkNorm);
    JLabel attackOverlay5 = new JLabel(atkNorm);
    JLabel attackOverlay6 = new JLabel(atkNorm);
    JLabel attackOverlay7 = new JLabel(atkNorm);
    JLabel attackOverlay8 = new JLabel(atkNorm);
    JLabel defenseOverlay1 = new JLabel(defNorm);
    JLabel defenseOverlay2 = new JLabel(defNorm);
    JLabel defenseOverlay3 = new JLabel(defNorm);
    JLabel defenseOverlay4 = new JLabel(defNorm);
    JLabel defenseOverlay5 = new JLabel(defNorm);
    JLabel defenseOverlay6 = new JLabel(defNorm);
    JLabel defenseOverlay7 = new JLabel(defNorm);
    JLabel defenseOverlay8 = new JLabel(defNorm);
    
    // tutotiral assets
    ImageIcon rightArrow = new ImageIcon("stim-megumi-sensei/tutorial/rightArrowSmall.png");
    ImageIcon leftArrow = new ImageIcon("stim-megumi-sensei/tutorial/leftArrowSmall.png");
    ImageIcon tutorial1 = new ImageIcon("stim-megumi-sensei/tutorial/1overview.png");
    ImageIcon tutorial2 = new ImageIcon("stim-megumi-sensei/tutorial/2moves.png");
    ImageIcon tutorial3 = new ImageIcon("stim-megumi-sensei/tutorial/3basicAttack.png");
    ImageIcon tutorial4 = new ImageIcon("stim-megumi-sensei/tutorial/4guard.png");
    ImageIcon tutorial5 = new ImageIcon("stim-megumi-sensei/tutorial/5magic.png");
    ImageIcon tutorial6 = new ImageIcon("stim-megumi-sensei/tutorial/6elementalAffinities.png");
    ImageIcon tutorial7 = new ImageIcon("stim-megumi-sensei/tutorial/7singleTargetMagic.png");
    ImageIcon tutorial8 = new ImageIcon("stim-megumi-sensei/tutorial/8targetAllMagic.png");
    ImageIcon tutorial9 = new ImageIcon("stim-megumi-sensei/tutorial/9healing.png");
    ImageIcon tutorial10 = new ImageIcon("stim-megumi-sensei/tutorial/10revives.png");
    ImageIcon tutorial11 = new ImageIcon("stim-megumi-sensei/tutorial/11stats.png");
    ImageIcon tutorial12 = new ImageIcon("stim-megumi-sensei/tutorial/12items.png");
    ImageIcon tutorial13 = new ImageIcon("stim-megumi-sensei/tutorial/13oracleLens.png");
    ImageIcon tutorial14 = new ImageIcon("stim-megumi-sensei/tutorial/14checkingAffinities.png");
    ImageIcon tutorial15 = new ImageIcon("stim-megumi-sensei/tutorial/15everfrost.png");
    ImageIcon tutorial16 = new ImageIcon("stim-megumi-sensei/tutorial/16lightningCrash.png");
    ImageIcon tutorial17 = new ImageIcon("stim-megumi-sensei/tutorial/17shock.png");
    ImageIcon tutorial18 = new ImageIcon("stim-megumi-sensei/tutorial/18cleanse.png");
    ImageIcon tutorial19 = new ImageIcon("stim-megumi-sensei/tutorial/19difficulty.png");
    ImageIcon tutorial20 = new ImageIcon("stim-megumi-sensei/tutorial/20battleLog.png");
    
    
    // move icons
    // These ability names are all from league of legends, but according to their "legal jibber jabber" document, I am allowed
    // to use assets of the league IP as long as it is for non commercial use
    // 0 fire // alchemy symbol: fire
    ImageIcon pyroclasm = new ImageIcon("stim-megumi-sensei/moves/0fire/pyroclasm.png"); // fire to all
    ImageIcon unPyroclasm = new ImageIcon("stim-megumi-sensei/moves/0fire/pyroclasmUn.png"); // fire to all
    ImageIcon sear = new ImageIcon("stim-megumi-sensei/moves/0fire/sear.png"); // fire to one
    ImageIcon unSear = new ImageIcon("stim-megumi-sensei/moves/0fire/searUn.png"); // fire to one
    
    // 1 water // alchemy symbol: water
    ImageIcon aquaPrison = new ImageIcon("stim-megumi-sensei/moves/1water/aquaPrison.png"); // water to one
    ImageIcon unAquaPrison = new ImageIcon("stim-megumi-sensei/moves/1water/aquaPrisonUn.png"); // water to one
    ImageIcon surgingTide = new ImageIcon("stim-megumi-sensei/moves/1water/surgingTide.png"); // water to all
    ImageIcon unSurgingTide = new ImageIcon("stim-megumi-sensei/moves/1water/surgingTideUn.png"); // water to all
    
    // 2 air // alchemy symbol: air
    ImageIcon monsoon = new ImageIcon("stim-megumi-sensei/moves/2wind/monsoon.png"); // wind to all
    ImageIcon unMonsoon = new ImageIcon("stim-megumi-sensei/moves/2wind/monsoonUn.png"); // wind to all
    ImageIcon zephyr = new ImageIcon("stim-megumi-sensei/moves/2wind/zephyr.png"); // wind to one
    ImageIcon unZephyr = new ImageIcon("stim-megumi-sensei/moves/2wind/zephyrUn.png"); // wind to one
    
    // 3 earth // alchemy symbol: earth
    ImageIcon magnetStorm = new ImageIcon("stim-megumi-sensei/moves/3earth/magnetStorm.png"); // earth to all
    ImageIcon unMagnetStorm = new ImageIcon("stim-megumi-sensei/moves/3earth/magnetStormUn.png"); // earth to all
    ImageIcon shatteringStrike = new ImageIcon("stim-megumi-sensei/moves/3earth/shatteringStrike.png"); // earth to one
    ImageIcon unShatteringStrike = new ImageIcon("stim-megumi-sensei/moves/3earth/shatteringStrikeUn.png"); // earth to one
    
    // 4 sun // alchemy symbol: sun
    ImageIcon solarFlare = new ImageIcon("stim-megumi-sensei/moves/4sun/solarFlare.png"); // sun to all
    ImageIcon unSolarFlare = new ImageIcon("stim-megumi-sensei/moves/4sun/solarFlareUn.png"); // sun to all
    ImageIcon zenithBlade = new ImageIcon("stim-megumi-sensei/moves/4sun/zenithBlade.png"); // sun to one
    ImageIcon unZenithBlade = new ImageIcon("stim-megumi-sensei/moves/4sun/zenithBladeUn.png"); // sun to one
    
    // 5 moon // alchemy symbol: moon
    ImageIcon lunarRush = new ImageIcon("stim-megumi-sensei/moves/5moon/lunarRush.png"); // moon to one
    ImageIcon unLunarRush = new ImageIcon("stim-megumi-sensei/moves/5moon/lunarRushUn.png"); // moon to one
    ImageIcon moonfall = new ImageIcon("stim-megumi-sensei/moves/5moon/moonfall.png"); // moon to all
    ImageIcon unMoonfall = new ImageIcon("stim-megumi-sensei/moves/5moon/moonfallUn.png"); // moon to all
    
    // 6 phys // alchemy symbol: lead
    ImageIcon needlework = new ImageIcon("stim-megumi-sensei/moves/6phys/needlework.png"); // phys to all
    ImageIcon unNeedlework = new ImageIcon("stim-megumi-sensei/moves/6phys/needleworkUn.png"); // phys to all
    ImageIcon snipSnip = new ImageIcon("stim-megumi-sensei/moves/6phys/snipSnip.png"); // phys to one
    ImageIcon unSnipSnip = new ImageIcon("stim-megumi-sensei/moves/6phys/snipSnipUn.png"); // phys to one
    
    // 7 healing // alchemy symbol: vinegar
    ImageIcon redemption = new ImageIcon("stim-megumi-sensei/moves/7heal/redemption.png"); // healing to one
    ImageIcon unRedemption = new ImageIcon("stim-megumi-sensei/moves/7heal/redemptionUn.png"); // healing to one
    ImageIcon guardianAngel = new ImageIcon("stim-megumi-sensei/moves/7heal/guardianAngel.png"); // revive to one
    ImageIcon unGuardianAngel = new ImageIcon("stim-megumi-sensei/moves/7heal/guardianAngelUn.png"); // revive to one
     
    // 8 stat boosts // alchemy symbol sulfur
    ImageIcon atkBoost = new ImageIcon("stim-megumi-sensei/moves/8buff/atkBoost.png"); // take a wild guess at what these do
    ImageIcon unAtkBoost = new ImageIcon("stim-megumi-sensei/moves/8buff/atkBoostUn.png");
    ImageIcon defBoost = new ImageIcon("stim-megumi-sensei/moves/8buff/defBoost.png");
    ImageIcon unDefBoost = new ImageIcon("stim-megumi-sensei/moves/8buff/defBoostUn.png");
    ImageIcon aglBoost = new ImageIcon("stim-megumi-sensei/moves/8buff/aglBoost.png");
    ImageIcon unAglBoost = new ImageIcon("stim-megumi-sensei/moves/8buff/aglBoostUn.png");
    ImageIcon atkDownTwo = new ImageIcon("stim-megumi-sensei/moves/8buff/atkDown.png");
    ImageIcon unAtkDown = new ImageIcon("stim-megumi-sensei/moves/8buff/atkDownUn.png");
    
    // 9 items // alchemy symbol potash
    ImageIcon oracleLens = new ImageIcon("stim-megumi-sensei/moves/9item/oracleLens.png"); // reveals affinity of one enemy
    ImageIcon unOracleLens = new ImageIcon("stim-megumi-sensei/moves/9item/oracleLensUn.png"); // reveals affinity of one enemy
    ImageIcon everfrost = new ImageIcon("stim-megumi-sensei/moves/9item/everfrost.png"); // restores mana to ally
    ImageIcon unEverfrost = new ImageIcon("stim-megumi-sensei/moves/9item/everfrostUn.png"); // restores mana to ally
    ImageIcon lightningCrash = new ImageIcon("stim-megumi-sensei/moves/9item/lightningCrash.png"); // shock one enemy
    ImageIcon unLightningCrash = new ImageIcon("stim-megumi-sensei/moves/9item/lightningCrashUn.png"); // shock one enemy
    ImageIcon focus = new ImageIcon("stim-megumi-sensei/moves/9item/focus.png"); // shock one enemy
    ImageIcon unFocus = new ImageIcon("stim-megumi-sensei/moves/9item/focusUn.png"); // shock one enemy
    ImageIcon cleanse = new ImageIcon("stim-megumi-sensei/moves/9item/cleanse.png");
    ImageIcon unCleanse = new ImageIcon("stim-megumi-sensei/moves/9item/cleanseUn.png");
    
    // enemy select buttons
    ImageIcon enemyOne = new ImageIcon("stim-megumi-sensei/buttons/enemyOne.png");
    ImageIcon enemyTwo = new ImageIcon("stim-megumi-sensei/buttons/enemyTwo.png");
    ImageIcon enemyThree = new ImageIcon("stim-megumi-sensei/buttons/enemyThree.png");
    ImageIcon enemyFour = new ImageIcon("stim-megumi-sensei/buttons/enemyFour.png");
    ImageIcon unEnemyOne = new ImageIcon("stim-megumi-sensei/buttons/enemyOneUn.png");
    ImageIcon unEnemyTwo = new ImageIcon("stim-megumi-sensei/buttons/enemyTwoUn.png");
    ImageIcon unEnemyThree = new ImageIcon("stim-megumi-sensei/buttons/enemyThreeUn.png");
    ImageIcon unEnemyFour = new ImageIcon("stim-megumi-sensei/buttons/enemyFourUn.png");
    
    // ally select buttons
    ImageIcon allyOne = new ImageIcon("stim-megumi-sensei/buttons/allyOne.png");
    ImageIcon allyTwo = new ImageIcon("stim-megumi-sensei/buttons/allyTwo.png");
    ImageIcon allyThree = new ImageIcon("stim-megumi-sensei/buttons/allyThree.png");
    ImageIcon allyFour = new ImageIcon("stim-megumi-sensei/buttons/allyFour.png");
    ImageIcon unAllyOne = new ImageIcon("stim-megumi-sensei/buttons/allyOneUn.png");
    ImageIcon unAllyTwo = new ImageIcon("stim-megumi-sensei/buttons/allyTwoUn.png");
    ImageIcon unAllyThree = new ImageIcon("stim-megumi-sensei/buttons/allyThreeUn.png");
    ImageIcon unAllyFour = new ImageIcon("stim-megumi-sensei/buttons/allyFourUn.png");
    
    // other, lmao
    ImageIcon back = new ImageIcon("stim-megumi-sensei/buttons/backSelected.png");
    ImageIcon unBack = new ImageIcon("stim-megumi-sensei/buttons/back.png");
    static ImageIcon currentAegis = new ImageIcon("stim-megumi-sensei/buttons/currentAegis.png");
    ImageIcon currentBlaze = new ImageIcon("stim-megumi-sensei/buttons/currentBlaze.png");
    ImageIcon currentDawn = new ImageIcon("stim-megumi-sensei/buttons/currentDawn.png");
    ImageIcon currentEerie = new ImageIcon("stim-megumi-sensei/buttons/currentEerie.png");
    ImageIcon currentReign = new ImageIcon("stim-megumi-sensei/buttons/currentReign.png");
    ImageIcon currentSentinel = new ImageIcon("stim-megumi-sensei/buttons/currentSentinel.png");
    ImageIcon currentSoul = new ImageIcon("stim-megumi-sensei/buttons/currentSoul.png");
    ImageIcon currentVirtue = new ImageIcon("stim-megumi-sensei/buttons/currentVirtue.png");

    public static void main(String[] args){
        System.out.println("Does this work?");
        if (currentAegis.getImageLoadStatus() == java.awt.MediaTracker.ERRORED) {
            System.out.println("Path is INCORRECT: The image could not be loaded.");
        } else {
            System.out.println("Path is CORRECT: The image loaded successfully.");
        }
    }
}