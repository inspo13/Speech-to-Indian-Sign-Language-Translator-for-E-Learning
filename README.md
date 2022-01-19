# SPEECH-TO-SIGN-LANGUAGE-TRANSLATOR-FOR-E-LEARNING--DSC-CHALLENGE-2021
## A android  application which takes in live audio speech as input from other e-learning  platform , converts it into text and displays the relevant Indian  Sign Language animations.

### The ability to communicate for deaf community has still not been ideal although there have been huge advancements in that field . Due to the onset of pandemic, the new tools for teaching have become popular. The online platforms like Microsoft Teams ,Zoom have been given the title of”online classroom” where the study lectures can take place from the comfort of a home. Although,through ages these platforms were not designed to suit the deaf community.As the whole education has shifted on platforms like these, it has been difficult for the deaf to be able to attend these. An ongoing  research is done by us , where it can be seen that deaf community has to go through different platforms to read and study .So,from there we got the motivation for our proposed system.

   
 
   *Front-end using xml in android studio \
   *Back-end using java in android studio \
   *Speech recognition using voice input and Google Speech API \
   *Text preprocessing using Natural Language Toolkit (NLTK) \
   *Text to Indian Sign Language through LSTM model \
   *Animation through blender 3D tool 
   
   *Project Demo Video*:-https://youtu.be/x_Pp3lHiHW4   
   ## Prerequisites:-
   
   1.Android Studio\
   2.Android supporting google speech API\
   3.Download all packages from SPEECH-TO-SIGN-LANGUAGE-TRANSLATOR-FOR-E-LEARNING--DSC-CHALLENGE-2021/app \
   4. For android requirements:- (Does not work on iOS) \
      --->1.Processor: \
           -Minimum 1 GHz; Recommended 2 GHz or more \
      --->2.Ethernet connect strongly action (LAN) OR a wireless adapter (Wi-Fi) \
      --->3.In-built microphone accessibility. 
      
  ## Installation Guide:-
  1. Open app-debug.apk from the main repository.
  2. Download it.
  3. Sign up and start exploring.
  4. Allow the app to access the microphone
  5. Apply split-screen by following the rules mentioned in the application. \
  6.Click on mic button to allow the recording. \
  7.Speech is going to processed and respective animated outputs are shown accordingly and it also support entered text manually.  
  8.In the repository, there is a folder named translation where there is the main file of the model named lstm.py which requires a txt file named glove.6B.100d.txt which is required to create word embeddings for the inputs and load the GloVe word vectors into memory.The data for it has not been possible to upload so here is the link of the site from where we downloaded the data is https://www.kaggle.com/danielwillgeorge/glove6b100dtxt

  ## The app framework:- 
 1 App starts with a splash screen of 3 secs \
 2. Then login activity appears \
 3. Tabbed activity starts with 3 tabs\
 4. Welcome(tab1) activity with a motivational quote \
 5. Direction Activity(tab2) –steps  are given to use split screen mode in android so that user can see the video lecture side by side\
 6. Translation Activity(tab3)- it has an image button by clicking on, it starts taking audio and convert it to text (using google api)then text is transferred to deep learning model to       generate hand gestures for the audio. \
 7. Next Navigation bar activity starts with home page still need to make this if time allows we are thinking of adding create online meet feature in this. \
 8. Next fragment is books here pdfs and links of books will be provided. \ 
 9. Next is make notes fragment to create study notes. \ 
 
