package com.example.quizapp.QuestionActivity;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import com.example.quizapp.Model.QuestionModel;
import com.example.quizapp.R;
import com.example.quizapp.ScoreActivity;
import com.example.quizapp.databinding.ActivityQuestionBinding;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity {

    ActivityQuestionBinding binding;
    ArrayList<QuestionModel> questions;
    int index = 0;
    QuestionModel question;
    CountDownTimer timer;
    int correctAnswers = 0;

    private  int count= 0;
    private  int position= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.quizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"I'm Stuck\uD83D\uDE29 \uD83D\uDE29  \n" +
                        "Can you help me for this particular question\uD83E\uDD17\uD83E\uDD17 : \n\n"
                        +question.getQuestion()+"\na)"+question.getOptionA()+"\nb)"+question.getOptionB()+"\nc)"
                        +question.getOptionC()+"\nd)"+question.getOptionD()+
                        "\n\nLet's Try Your Luck \uD83E\uDD73 \uD83E\uDD73  !!!\n\n\nDownload This Fantastic App" +
                        " and Explore Your General Knowledge By Playing Some Amazing Quiz ✌️ ✌️ .\n\n"+getPackageName());

                startActivity(Intent.createChooser(intent,"Choose one"));
            }
        });

        questions = new ArrayList<>();

        String setName=getIntent().getStringExtra("set");

        if (setName.equals("SET-1")){
            setOne();

        }
        else if (setName.equals("SET-2")){
            setTwo();

        }
        else if (setName.equals("SET-3")){
            setThree();

        }
        else if (setName.equals("SET-4")){
            setFour();

        }
        else if (setName.equals("SET-5")){
            setFive();

        }
        else if (setName.equals("SET-6")){
            setSix();

        }
        else if (setName.equals("SET-7")){
            setSeven();

        }
        else if (setName.equals("SET-8")){
            setEight();

        }
        else if (setName.equals("SET-9")){
            setNine();

        }
        else if (setName.equals("SET-10")){
            setTen();

        }


        if (setName.equals("SET-A")){
            setA();

        }
        else if (setName.equals("SET-B")){
            setB();

        }
        else if (setName.equals("SET-C")){
            setC();

        }
        else if (setName.equals("SET-D")){
            setD();

        }
        else if (setName.equals("SET-E")){
            setE();

        }
        else if (setName.equals("SET-F")){
            setF();

        }
        else if (setName.equals("SET-G")){
            setG();

        }
        else if (setName.equals("SET-H")){
            setH();

        }
        else if (setName.equals("SET-I")){
            setI();

        }
        else if (setName.equals("SET-J")){
            setJ();

        }


        if (setName.equals("SET-S1")){
            setS1();

        }
        else if (setName.equals("SET-S2")){
            setS2();

        }
        else if (setName.equals("SET-S3")){
            setS3();

        }
        else if (setName.equals("SET-S4")){
            setS4();

        }
        else if (setName.equals("SET-S5")){
            setS5();

        }
        else if (setName.equals("SET-S6")){
            setS6();

        }
        else if (setName.equals("SET-S7")){
            setS7();

        }
        else if (setName.equals("SET-S8")){
            setS8();

        }
        else if (setName.equals("SET-S9")){
            setS9();

        }
        else if (setName.equals("SET-S10")){
            setS10();

        }


        if (setName.equals("SET-G1")){
            setG1();
        }
        else if (setName.equals("SET-G2")){
            setG2();

        }
        else if (setName.equals("SET-G3")){
            setG3();

        }
        else if (setName.equals("SET-G4")){
            setG4();

        }
        else if (setName.equals("SET-G5")){
            setG5();

        }
        else if (setName.equals("SET-G6")){
            setG6();

        }
        else if (setName.equals("SET-G7")){
            setG7();

        }
        else if (setName.equals("SET-G8")){
            setG8();

        }
        else if (setName.equals("SET-G9")){
            setG9();

        }
        else if (setName.equals("SET-G10")){
            setG10();

        }


        playAnimation(binding.question,0,questions.get(position).getQuestion());
        resetTimer();

    }


    private void setG10() {
        questions.add(new QuestionModel("Which of the following is India’s largest salt producing state?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Gujarat"));
        questions.add(new QuestionModel("In which of the following Himalaya , high peaks are very rare?","Kashmir Himalaya","Punjab Himalaya","Kumaon Himalaya","Trans Himalayas","Punjab Himalaya"));
        questions.add(new QuestionModel("India’s largest inland saline wetland system is located in which of the following states ?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Rajasthan"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("The vertical rock face known as Hillary step is located in which of the following mountain peak?","Kanchenjunga","Mt. Everest","Nanda Devi","Trishul","Mt. Everest"));
        return;

    }

    private void setG9() {
        questions.add(new QuestionModel("Highest urban density is found in which of the following states of India?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Tamil Nadu"));
        questions.add(new QuestionModel("he concentration of the Urban population is highest in which of the following states of India?","Rajasthan","Gujarat","Maharashtra","West Bengal","Maharashtra"));
        questions.add(new QuestionModel("The Valley of Flowers National Park is located in ____:","Uttarakhand","Meghalaya","Odisha","Himachal Pradesh","Uttarakhand"));
        questions.add(new QuestionModel("Which of the following is not a twin city of India?","Thrissur and Thiruvalla","Hubli and Dharwad","Ahmedabad and Gandhinagar","Cuttack and Bhubaneswar","Thrissur and Thiruvalla"));
        questions.add(new QuestionModel("Which is the smallest state of India in Terms of area?","Goa","Rajasthan"," Manipur","Kerala","Goa"));
        return;
    }

    private void setG8() {
        questions.add(new QuestionModel("Which of the following is India’s largest salt producing state?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Gujarat"));
        questions.add(new QuestionModel("In which of the following Himalaya , high peaks are very rare?","Kashmir Himalaya","Punjab Himalaya","Kumaon Himalaya","Trans Himalayas","Punjab Himalaya"));
        questions.add(new QuestionModel("India’s largest inland saline wetland system is located in which of the following states ?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Rajasthan"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("The vertical rock face known as Hillary step is located in which of the following mountain peak?","Kanchenjunga","Mt. Everest","Nanda Devi","Trishul","Mt. Everest"));
        return;
    }

    private void setG7() {
        questions.add(new QuestionModel("Highest urban density is found in which of the following states of India?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Tamil Nadu"));
        questions.add(new QuestionModel("he concentration of the Urban population is highest in which of the following states of India?","Rajasthan","Gujarat","Maharashtra","West Bengal","Maharashtra"));
        questions.add(new QuestionModel("The Valley of Flowers National Park is located in ____:","Uttarakhand","Meghalaya","Odisha","Himachal Pradesh","Uttarakhand"));
        questions.add(new QuestionModel("Which of the following is not a twin city of India?","Thrissur and Thiruvalla","Hubli and Dharwad","Ahmedabad and Gandhinagar","Cuttack and Bhubaneswar","Thrissur and Thiruvalla"));
        questions.add(new QuestionModel("Which is the smallest state of India in Terms of area?","Goa","Rajasthan"," Manipur","Kerala","Goa"));
        return;
    }

    private void setG6() {
        questions.add(new QuestionModel("Which of the following is India’s largest salt producing state?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Gujarat"));
        questions.add(new QuestionModel("In which of the following Himalaya , high peaks are very rare?","Kashmir Himalaya","Punjab Himalaya","Kumaon Himalaya","Trans Himalayas","Punjab Himalaya"));
        questions.add(new QuestionModel("India’s largest inland saline wetland system is located in which of the following states ?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Rajasthan"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("The vertical rock face known as Hillary step is located in which of the following mountain peak?","Kanchenjunga","Mt. Everest","Nanda Devi","Trishul","Mt. Everest"));
        return;
    }

    private void setG5() {
        questions.add(new QuestionModel("Highest urban density is found in which of the following states of India?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Tamil Nadu"));
        questions.add(new QuestionModel("he concentration of the Urban population is highest in which of the following states of India?","Rajasthan","Gujarat","Maharashtra","West Bengal","Maharashtra"));
        questions.add(new QuestionModel("The Valley of Flowers National Park is located in ____:","Uttarakhand","Meghalaya","Odisha","Himachal Pradesh","Uttarakhand"));
        questions.add(new QuestionModel("Which of the following is not a twin city of India?","Thrissur and Thiruvalla","Hubli and Dharwad","Ahmedabad and Gandhinagar","Cuttack and Bhubaneswar","Thrissur and Thiruvalla"));
        questions.add(new QuestionModel("Which is the smallest state of India in Terms of area?","Goa","Rajasthan"," Manipur","Kerala","Goa"));
        return;
    }

    private void setG4() {
        questions.add(new QuestionModel("Which of the following is India’s largest salt producing state?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Gujarat"));
        questions.add(new QuestionModel("In which of the following Himalaya , high peaks are very rare?","Kashmir Himalaya","Punjab Himalaya","Kumaon Himalaya","Trans Himalayas","Punjab Himalaya"));
        questions.add(new QuestionModel("India’s largest inland saline wetland system is located in which of the following states ?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Rajasthan"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("The vertical rock face known as Hillary step is located in which of the following mountain peak?","Kanchenjunga","Mt. Everest","Nanda Devi","Trishul","Mt. Everest"));
        return;
    }

    private void setG3() {
        questions.add(new QuestionModel("Highest urban density is found in which of the following states of India?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Tamil Nadu"));
        questions.add(new QuestionModel("he concentration of the Urban population is highest in which of the following states of India?","Rajasthan","Gujarat","Maharashtra","West Bengal","Maharashtra"));
        questions.add(new QuestionModel("The Valley of Flowers National Park is located in ____:","Uttarakhand","Meghalaya","Odisha","Himachal Pradesh","Uttarakhand"));
        questions.add(new QuestionModel("Which of the following is not a twin city of India?","Thrissur and Thiruvalla","Hubli and Dharwad","Ahmedabad and Gandhinagar","Cuttack and Bhubaneswar","Thrissur and Thiruvalla"));
        questions.add(new QuestionModel("Which is the smallest state of India in Terms of area?","Goa","Rajasthan"," Manipur","Kerala","Goa"));
        return;
    }

    private void setG2() {
        questions.add(new QuestionModel("Which of the following is India’s largest salt producing state?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Gujarat"));
        questions.add(new QuestionModel("In which of the following Himalaya , high peaks are very rare?","Kashmir Himalaya","Punjab Himalaya","Kumaon Himalaya","Trans Himalayas","Punjab Himalaya"));
        questions.add(new QuestionModel("India’s largest inland saline wetland system is located in which of the following states ?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Rajasthan"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("The vertical rock face known as Hillary step is located in which of the following mountain peak?","Kanchenjunga","Mt. Everest","Nanda Devi","Trishul","Mt. Everest"));
        return;
    }

    private void setG1() {
        questions.add(new QuestionModel("Highest urban density is found in which of the following states of India?","Rajasthan","Gujarat","Odisha","Tamil Nadu","Tamil Nadu"));
        questions.add(new QuestionModel("he concentration of the Urban population is highest in which of the following states of India?","Rajasthan","Gujarat","Maharashtra","West Bengal","Maharashtra"));
        questions.add(new QuestionModel("The Valley of Flowers National Park is located in ____:","Uttarakhand","Meghalaya","Odisha","Himachal Pradesh","Uttarakhand"));
        questions.add(new QuestionModel("Which of the following is not a twin city of India?","Thrissur and Thiruvalla","Hubli and Dharwad","Ahmedabad and Gandhinagar","Cuttack and Bhubaneswar","Thrissur and Thiruvalla"));
        questions.add(new QuestionModel("Which is the smallest state of India in Terms of area?","Goa","Rajasthan"," Manipur","Kerala","Goa"));
        return;
    }



    private void setS10() {
        questions.add(new QuestionModel("If the time of revolution is T in a satellite, then kinetic energy is proportional to which of the following:","T^2/3","T^-2/3","T^-4/3","T^-1/3","T^-2/3"));
        questions.add(new QuestionModel("What part of the electromagnetic spectrum is detected by the human eye?"," Between 400 nm and 700 nm"," Between 40 nm and 70 nm"," Between 4 nm and 700 nm","Between 400 nm and 7000 nm"," Between 400 nm and 700 nm"));
        questions.add(new QuestionModel("Which gas is produced when Calcium carbide is treated with water?","Methane","Ethene","Ethyne","LPG","Ethyne"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("In the branch of biology, what is the transmission of paternal traits to progeny called?","Genetics","Gerontology","Heredity","Genetic Engineering","Heredity"));
        return;
    }

    private void setS9() {
        questions.add(new QuestionModel("Which among the following indicates Vitamin B12?","Niacin","Cobalamine","Pyridoxine","Thiamine","Cobalamine"));
        questions.add(new QuestionModel("Which of the following represents angular frequency of a body?","twice the frequency of the body","product of frequency of the body with 3 π","product of frequency of the body with π","half the frequency of the body","twice the frequency of the body"));
        questions.add(new QuestionModel("Which of the following are used as chemical agents in war?","Mustard Gas","Phosgene","Sarin","all of the above","all of the above"));
        questions.add(new QuestionModel("Which of the following electromagnetic waves in the EM spectrum has the highest wavelength?","X-rays","Infrared","UV-rays"," Visible","Infrared"));
        questions.add(new QuestionModel("Which of the following is a suitable material for making a permanent magnet?","cobalt steel"," ticonal","alnico"," All of the above"," All of the above"));
        return;

    }

    private void setS8() {
        questions.add(new QuestionModel("If the time of revolution is T in a satellite, then kinetic energy is proportional to which of the following:","T^2/3","T^-2/3","T^-4/3","T^-1/3","T^-2/3"));
        questions.add(new QuestionModel("What part of the electromagnetic spectrum is detected by the human eye?"," Between 400 nm and 700 nm"," Between 40 nm and 70 nm"," Between 4 nm and 700 nm","Between 400 nm and 7000 nm"," Between 400 nm and 700 nm"));
        questions.add(new QuestionModel("Which gas is produced when Calcium carbide is treated with water?","Methane","Ethene","Ethyne","LPG","Ethyne"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("In the branch of biology, what is the transmission of paternal traits to progeny called?","Genetics","Gerontology","Heredity","Genetic Engineering","Heredity"));
        return;
    }

    private void setS7() {
        questions.add(new QuestionModel("Which among the following indicates Vitamin B12?","Niacin","Cobalamine","Pyridoxine","Thiamine","Cobalamine"));
        questions.add(new QuestionModel("Which of the following represents angular frequency of a body?","twice the frequency of the body","product of frequency of the body with 3 π","product of frequency of the body with π","half the frequency of the body","twice the frequency of the body"));
        questions.add(new QuestionModel("Which of the following are used as chemical agents in war?","Mustard Gas","Phosgene","Sarin","all of the above","all of the above"));
        questions.add(new QuestionModel("Which of the following electromagnetic waves in the EM spectrum has the highest wavelength?","X-rays","Infrared","UV-rays"," Visible","Infrared"));
        questions.add(new QuestionModel("Which of the following is a suitable material for making a permanent magnet?","cobalt steel"," ticonal","alnico"," All of the above"," All of the above"));
        return;

    }

    private void setS6() {
        questions.add(new QuestionModel("If the time of revolution is T in a satellite, then kinetic energy is proportional to which of the following:","T^2/3","T^-2/3","T^-4/3","T^-1/3","T^-2/3"));
        questions.add(new QuestionModel("What part of the electromagnetic spectrum is detected by the human eye?"," Between 400 nm and 700 nm"," Between 40 nm and 70 nm"," Between 4 nm and 700 nm","Between 400 nm and 7000 nm"," Between 400 nm and 700 nm"));
        questions.add(new QuestionModel("Which gas is produced when Calcium carbide is treated with water?","Methane","Ethene","Ethyne","LPG","Ethyne"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("In the branch of biology, what is the transmission of paternal traits to progeny called?","Genetics","Gerontology","Heredity","Genetic Engineering","Heredity"));
        return;
    }

    private void setS5() {
        questions.add(new QuestionModel("Which among the following indicates Vitamin B12?","Niacin","Cobalamine","Pyridoxine","Thiamine","Cobalamine"));
        questions.add(new QuestionModel("Which of the following represents angular frequency of a body?","twice the frequency of the body","product of frequency of the body with 3 π","product of frequency of the body with π","half the frequency of the body","twice the frequency of the body"));
        questions.add(new QuestionModel("Which of the following are used as chemical agents in war?","Mustard Gas","Phosgene","Sarin","all of the above","all of the above"));
        questions.add(new QuestionModel("Which of the following electromagnetic waves in the EM spectrum has the highest wavelength?","X-rays","Infrared","UV-rays"," Visible","Infrared"));
        questions.add(new QuestionModel("Which of the following is a suitable material for making a permanent magnet?","cobalt steel"," ticonal","alnico"," All of the above"," All of the above"));
        return;

    }

    private void setS4() {
        questions.add(new QuestionModel("If the time of revolution is T in a satellite, then kinetic energy is proportional to which of the following:","T^2/3","T^-2/3","T^-4/3","T^-1/3","T^-2/3"));
        questions.add(new QuestionModel("What part of the electromagnetic spectrum is detected by the human eye?"," Between 400 nm and 700 nm"," Between 40 nm and 70 nm"," Between 4 nm and 700 nm","Between 400 nm and 7000 nm"," Between 400 nm and 700 nm"));
        questions.add(new QuestionModel("Which gas is produced when Calcium carbide is treated with water?","Methane","Ethene","Ethyne","LPG","Ethyne"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("In the branch of biology, what is the transmission of paternal traits to progeny called?","Genetics","Gerontology","Heredity","Genetic Engineering","Heredity"));
        return;
    }

    private void setS3() {
        questions.add(new QuestionModel("Which among the following indicates Vitamin B12?","Niacin","Cobalamine","Pyridoxine","Thiamine","Cobalamine"));
        questions.add(new QuestionModel("Which of the following represents angular frequency of a body?","twice the frequency of the body","product of frequency of the body with 3 π","product of frequency of the body with π","half the frequency of the body","twice the frequency of the body"));
        questions.add(new QuestionModel("Which of the following are used as chemical agents in war?","Mustard Gas","Phosgene","Sarin","all of the above","all of the above"));
        questions.add(new QuestionModel("Which of the following electromagnetic waves in the EM spectrum has the highest wavelength?","X-rays","Infrared","UV-rays"," Visible","Infrared"));
        questions.add(new QuestionModel("Which of the following is a suitable material for making a permanent magnet?","cobalt steel"," ticonal","alnico"," All of the above"," All of the above"));
        return;

    }

    private void setS2() {
        questions.add(new QuestionModel("If the time of revolution is T in a satellite, then kinetic energy is proportional to which of the following:","T^2/3","T^-2/3","T^-4/3","T^-1/3","T^-2/3"));
        questions.add(new QuestionModel("What part of the electromagnetic spectrum is detected by the human eye?"," Between 400 nm and 700 nm"," Between 40 nm and 70 nm"," Between 4 nm and 700 nm","Between 400 nm and 7000 nm"," Between 400 nm and 700 nm"));
        questions.add(new QuestionModel("Which gas is produced when Calcium carbide is treated with water?","Methane","Ethene","Ethyne","LPG","Ethyne"));
        questions.add(new QuestionModel("Which of these non-metals is commonly used in fire-crackers?","Neon","Silicon","Fluorine","Sulphur","Sulphur"));
        questions.add(new QuestionModel("In the branch of biology, what is the transmission of paternal traits to progeny called?","Genetics","Gerontology","Heredity","Genetic Engineering","Heredity"));
        return;
    }

    private void setS1() {
        questions.add(new QuestionModel("Which among the following indicates Vitamin B12?","Niacin","Cobalamine","Pyridoxine","Thiamine","Cobalamine"));
        questions.add(new QuestionModel("Which of the following represents angular frequency of a body?","twice the frequency of the body","product of frequency of the body with 3 π","product of frequency of the body with π","half the frequency of the body","twice the frequency of the body"));
        questions.add(new QuestionModel("Which of the following are used as chemical agents in war?","Mustard Gas","Phosgene","Sarin","all of the above","all of the above"));
        questions.add(new QuestionModel("Which of the following electromagnetic waves in the EM spectrum has the highest wavelength?","X-rays","Infrared","UV-rays"," Visible","Infrared"));
        questions.add(new QuestionModel("Which of the following is a suitable material for making a permanent magnet?","cobalt steel"," ticonal","alnico"," All of the above"," All of the above"));
        return;

    }



    private void setI() {
        questions.add(new QuestionModel("If David’s age is 27 years old in 2011. What was his age in 2003?","17","37","19","20","19"));
        questions.add(new QuestionModel("I am a number. I have 7 in the ones place. I am less than 80 but greater than 70. What is my number?","71","73","75","77","77"));
        questions.add(new QuestionModel("What is three fifth of 100?","3","5","20","60","60"));
        questions.add(new QuestionModel("What is 7% equal to?","0.007","0.07","0.7","7","0.07"));
        questions.add(new QuestionModel(" What is the value of x if x2 = 169","1","13","338","169","13"));
        return;
    }

    private void setH() {
        questions.add(new QuestionModel(" In a century how many months are there?","12","1200","120","12000","1200"));
        questions.add(new QuestionModel(" Find the Missing Term in Multiples of 6 : 6, 12, 18, 24, _, 36, 42, _ 54, 60.","32, 45","30, 48","15,26","25, 49","30, 48"));
        questions.add(new QuestionModel(" How many years are there in a decade?","20","5","10","15","10"));
        questions.add(new QuestionModel("The Product of 131 × 0 × 300 × 4","39300","0","131","1200","0"));
        questions.add(new QuestionModel("Priya had 16 Red Balls, 2 Green Balls, 9  Blue Balls, and 1 Multicolor Ball. If He Lost 9 Red Balls, 1 Green Ball, and 3 Blue Balls. How Many Balls would be Left?","15","13","39","28","15"));
        return;
    }

    private void setF() {
        questions.add(new QuestionModel(" In a century how many months are there?","12","1200","120","12000","1200"));
        questions.add(new QuestionModel(" Find the Missing Term in Multiples of 6 : 6, 12, 18, 24, _, 36, 42, _ 54, 60.","32, 45","30, 48","15,26","25, 49","30, 48"));
        questions.add(new QuestionModel(" How many years are there in a decade?","20","5","10","15","10"));
        questions.add(new QuestionModel("The Product of 131 × 0 × 300 × 4","39300","0","131","1200","0"));
        questions.add(new QuestionModel("Priya had 16 Red Balls, 2 Green Balls, 9  Blue Balls, and 1 Multicolor Ball. If He Lost 9 Red Balls, 1 Green Ball, and 3 Blue Balls. How Many Balls would be Left?","15","13","39","28","15"));
        return;
    }

    private void setG() {
        questions.add(new QuestionModel("If David’s age is 27 years old in 2011. What was his age in 2003?","17","37","19","20","19"));
        questions.add(new QuestionModel("I am a number. I have 7 in the ones place. I am less than 80 but greater than 70. What is my number?","71","73","75","77","77"));
        questions.add(new QuestionModel("What is three fifth of 100?","3","5","20","60","60"));
        questions.add(new QuestionModel("What is 7% equal to?","0.007","0.07","0.7","7","0.07"));
        questions.add(new QuestionModel(" What is the value of x if x2 = 169","1","13","338","169","13"));
        return;
    }

    private void setD() {
        questions.add(new QuestionModel(" In a century how many months are there?","12","1200","120","12000","1200"));
        questions.add(new QuestionModel(" Find the Missing Term in Multiples of 6 : 6, 12, 18, 24, _, 36, 42, _ 54, 60.","32, 45","30, 48","15,26","25, 49","30, 48"));
        questions.add(new QuestionModel(" How many years are there in a decade?","20","5","10","15","10"));
        questions.add(new QuestionModel("The Product of 131 × 0 × 300 × 4","39300","0","131","1200","0"));
        questions.add(new QuestionModel("Priya had 16 Red Balls, 2 Green Balls, 9  Blue Balls, and 1 Multicolor Ball. If He Lost 9 Red Balls, 1 Green Ball, and 3 Blue Balls. How Many Balls would be Left?","15","13","39","28","15"));
        return;

    }

    private void setE() {
        questions.add(new QuestionModel("If David’s age is 27 years old in 2011. What was his age in 2003?","17","37","19","20","19"));
        questions.add(new QuestionModel("I am a number. I have 7 in the ones place. I am less than 80 but greater than 70. What is my number?","71","73","75","77","77"));
        questions.add(new QuestionModel("What is three fifth of 100?","3","5","20","60","60"));
        questions.add(new QuestionModel("What is 7% equal to?","0.007","0.07","0.7","7","0.07"));
        questions.add(new QuestionModel(" What is the value of x if x2 = 169","1","13","338","169","13"));
        return;
    }

    private void setC() {
        questions.add(new QuestionModel("If David’s age is 27 years old in 2011. What was his age in 2003?","17","37","19","20","19"));
        questions.add(new QuestionModel("I am a number. I have 7 in the ones place. I am less than 80 but greater than 70. What is my number?","71","73","75","77","77"));
        questions.add(new QuestionModel("What is three fifth of 100?","3","5","20","60","60"));
        questions.add(new QuestionModel("What is 7% equal to?","0.007","0.07","0.7","7","0.07"));
        questions.add(new QuestionModel(" What is the value of x if x2 = 169","1","13","338","169","13"));
        return;
    }

    private void setB() {
        questions.add(new QuestionModel(" In a century how many months are there?","12","1200","120","12000","1200"));
        questions.add(new QuestionModel(" Find the Missing Term in Multiples of 6 : 6, 12, 18, 24, _, 36, 42, _ 54, 60.","32, 45","30, 48","15,26","25, 49","30, 48"));
        questions.add(new QuestionModel(" How many years are there in a decade?","20","5","10","15","10"));
        questions.add(new QuestionModel("The Product of 131 × 0 × 300 × 4","39300","0","131","1200","0"));
        questions.add(new QuestionModel("Priya had 16 Red Balls, 2 Green Balls, 9  Blue Balls, and 1 Multicolor Ball. If He Lost 9 Red Balls, 1 Green Ball, and 3 Blue Balls. How Many Balls would be Left?","15","13","39","28","15"));
        return;
    }

    private void setA() {
        questions.add(new QuestionModel("If David’s age is 27 years old in 2011. What was his age in 2003?","17","37","19","20","19"));
        questions.add(new QuestionModel("I am a number. I have 7 in the ones place. I am less than 80 but greater than 70. What is my number?","71","73","75","77","77"));
        questions.add(new QuestionModel("What is three fifth of 100?","3","5","20","60","60"));
        questions.add(new QuestionModel("What is 7% equal to?","0.007","0.07","0.7","7","0.07"));
        questions.add(new QuestionModel(" What is the value of x if x2 = 169","1","13","338","169","13"));
        return;
    }

    private void setJ() {
        questions.add(new QuestionModel(" In a century how many months are there?","12","1200","120","12000","1200"));
        questions.add(new QuestionModel(" Find the Missing Term in Multiples of 6 : 6, 12, 18, 24, _, 36, 42, _ 54, 60.","32, 45","30, 48","15,26","25, 49","30, 48"));
        questions.add(new QuestionModel(" How many years are there in a decade?","20","5","10","15","10"));
        questions.add(new QuestionModel("The Product of 131 × 0 × 300 × 4","39300","0","131","1200","0"));
        questions.add(new QuestionModel("Priya had 16 Red Balls, 2 Green Balls, 9  Blue Balls, and 1 Multicolor Ball. If He Lost 9 Red Balls, 1 Green Ball, and 3 Blue Balls. How Many Balls would be Left?","15","13","39","28","15"));
        return;
    }



    private void setTen() {
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));
        return;
    }

    private void setNine() {
        questions.add(new QuestionModel("Which is the largest civilization in the world?"," Egypt civilization","China Civilization","Indus valley civilization","Mesopotamian civilization","Indus valley civilization"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));

        return;
    }

    private void setEight() {
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));
        return;
    }

    private void setSeven() {
        questions.add(new QuestionModel("Which is the largest civilization in the world?"," Egypt civilization","China Civilization","Indus valley civilization","Mesopotamian civilization","Indus valley civilization"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));

        return;
    }

    private void setSix() {
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));
        return;
    }

    private void setFive() {
        questions.add(new QuestionModel("Which is the largest civilization in the world?"," Egypt civilization","China Civilization","Indus valley civilization","Mesopotamian civilization","Indus valley civilization"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));

        return;
    }

    private void setFour() {
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));
        return;
    }

    private void setThree() {
        questions.add(new QuestionModel("Which is the largest civilization in the world?"," Egypt civilization","China Civilization","Indus valley civilization","Mesopotamian civilization","Indus valley civilization"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));

        return;
    }

    
    
    private void playAnimation(View view, int value, String data) {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100).setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(@NonNull Animator animation) {
                if (value==0 && count<4){
                    String option="";

                    if(count==0){
                        option=questions.get(position).getOptionA();
                    }else if (count==1){
                        option=questions.get(position).getOptionB();
                    }
                    else if (count==2){
                        option=questions.get(position).getOptionC();
                    }
                    else if (count==3){
                        option=questions.get(position).getOptionD();
                    }
                    playAnimation(binding.OptionContainer.getChildAt(count),0,option);
                    count++;

                }
            }

            @Override
            public void onAnimationEnd(@NonNull Animator animation) {
                if (value==0){
                    try {
                        ((TextView)view).setText(data);
                        setNextQuestion();
                    }catch (Exception e){
                        ((Button)view).setText(data);
                    }

                    view.setTag(data);
                    playAnimation(view,1,data);
                }
            }

            @Override
            public void onAnimationCancel(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationRepeat(@NonNull Animator animation) {

            }
        });
    }


    private void setTwo() {

        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));
        return;
    }
    private void setOne() {

        questions.add(new QuestionModel("Which is the largest civilization in the world?"," Egypt civilization","China Civilization","Indus valley civilization","Mesopotamian civilization","Indus valley civilization"));
        questions.add(new QuestionModel("Which is the most famous seal found from the Harrapan civilization?","Animal seal","Pashupati seal","Long seal M-1271","All of the above","Pashupati seal"));
        questions.add(new QuestionModel("What was the major economic source of the Indus valley civilization?","Making weapons","Agriculture","Trading (buying and selling goods)"," All of the above","Agriculture"));
        questions.add(new QuestionModel("Which was the largest empire in India?","Mughal empire","Maurya empire","Maratha empire"," Kushan empire","Maurya empire"));
        questions.add(new QuestionModel("What type of cities were Harappa and Mohenjo-Daro?","Religious cities"," Unplanned cities","Planned cities","  Merchant cities","Planned cities"));

        return;
    }

    void resetTimer() {
        timer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                binding.timer.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {

            }
        };
    }

    void showAnswer() {
        if(question.getAnswer().equals(binding.option1.getText().toString()))
            binding.option1.setBackground(getResources().getDrawable(R.drawable.option_right));
        else if(question.getAnswer().equals(binding.option2.getText().toString()))
            binding.option2.setBackground(getResources().getDrawable(R.drawable.option_right));
        else if(question.getAnswer().equals(binding.option3.getText().toString()))
            binding.option3.setBackground(getResources().getDrawable(R.drawable.option_right));
        else if(question.getAnswer().equals(binding.option4.getText().toString()))
            binding.option4.setBackground(getResources().getDrawable(R.drawable.option_right));
    }

    void setNextQuestion() {
        if(timer != null)
            timer.cancel();

        timer.start();

        if(index == 5 ){
            Intent intent = new Intent(QuestionActivity.this, ScoreActivity.class);
            intent.putExtra("correct", correctAnswers);
            intent.putExtra("total",5);
            startActivity(intent);
            return;
        }
        if(index < 5) {
            binding.questionCounter.setText(String.format("%d/%d", (index+1), 5));
            question = questions.get(index);
            binding.question.setText(question.getQuestion());
            binding.option1.setText(question.getOptionA());
            binding.option2.setText(question.getOptionB());
            binding.option3.setText(question.getOptionC());
            binding.option4.setText(question.getOptionD());
        }
    }

    void checkAnswer(TextView textView) {
        String selectedAnswer = textView.getText().toString();
        if(selectedAnswer.equals(question.getAnswer()) ) {
            correctAnswers++;
            textView.setBackground(getResources().getDrawable(R.drawable.option_right));
        } else {
            showAnswer();
            textView.setBackground(getResources().getDrawable(R.drawable.option_wrong));
        }


    }

    void reset() {

        binding.option1.setBackground(getResources().getDrawable(R.drawable.option_unselected));
        binding.option2.setBackground(getResources().getDrawable(R.drawable.option_unselected));
        binding.option3.setBackground(getResources().getDrawable(R.drawable.option_unselected));
        binding.option4.setBackground(getResources().getDrawable(R.drawable.option_unselected));
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.option_1:
            case R.id.option_2:
            case R.id.option_3:
            case R.id.option_4:
                if(timer!=null)
                    timer.cancel();
                TextView selected = (TextView) view;
                checkAnswer(selected);

                break;
            case R.id.nextBtn:

                reset();
                if(index < 5) {
                    index++;
                    setNextQuestion();
                }
               else {
                    Intent intent = new Intent(QuestionActivity.this, ScoreActivity.class);
                    intent.putExtra("correct", correctAnswers);
                    intent.putExtra("total",5);
                    startActivity(intent);
                    return;
                }
                break;
        }
    }

}