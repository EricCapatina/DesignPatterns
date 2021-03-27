import Views.*;
import Resources.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args)
    {
        // Problema:
        // Pentru ca sa nu fie creat cate 3 display-uri pentru fiecare clasa in parte, precum ar fi
        // Display pentru HighLevelMonsterDisplay, LowLevelMonsterDisplay, etc. Si pentru Item-uri ->
        // HighLevelItemDisplay, LowLevelItemDisplay, etc.


        System.out.println("Print your player Spoil Skill level:\n");
        Scanner scan = new Scanner(System.in);
        int skillLevel = scan.nextInt();
        DisplayInformation Deodur = Display(skillLevel);
        DisplayInformation LegionBlade = Display(skillLevel);
        Deodur.resource = new MonsterResource("HP: 2134.5\nMP: 1154.3\nPhysical Attack: 1152.4\n" +
                "Magical Attack: 445.5\nName: 'Higher Demon Rurriq'", "Legion Blade[0.5%]\n" +
                "Elven Sword[0.05%]\nAdamantite[13.55%]", "Demon Horn[1-2]\nRurriq Venom[2-4]");


        LegionBlade.resource = new ItemResource("Physical Attack: 334.0\n" +
                "Magical Attack: 144.3", "None", "Higher Demon Rurriq[26 level]\n" +
                "Dark Queen Elizabet[World Boss(33 level)]");
        String MonsterDisplaytext = Deodur.Display();
        System.out.println(MonsterDisplaytext);
        System.out.println("----===========================================----");
        String ItemDisplayText = LegionBlade.Display();
        System.out.println(ItemDisplayText);
    }
    static DisplayInformation Display(int spoilSkillLevel)
    {
        if (spoilSkillLevel < 3)
        {
            return new LowLevelDisplay();
        }
        else if (spoilSkillLevel < 7)
        {
            return new MediumLevelDisplay();
        }
        else if (spoilSkillLevel > 7)
        {
            return new HighLevelDisplay();
        }
        else
        {
            throw new RuntimeException(spoilSkillLevel + " Unknown number");
        }
    }
}
