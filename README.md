*# LibGdxInAndroidProject
Demonstrates how to include the LibGdx game development framework into an existing Android application so that you can show your game as a Android Fragment to place within an Activity

# Project Structure

**my-gdx-game-core**

Java only module. Game code goes here.
No platform specific code should be placed here 

**my-gdx-game-android**

Android specific code for the game goes here.
Contains Android launcher for the game. This example uses AndroidFragmentApplication to allow the game to be shown as a Fragment

**app**

Your typical Android application module

