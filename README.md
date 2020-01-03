# Android Sound Test App

This test project will be used to assess your skills when working with signal processing and sound in Android.

## Base Project

This repository has been initialized with a base app to save you time writing boilerplate code. The project is using Kotlin, Data Binding and Android Architecture Components. If you feel more confortable working with a different architecture pattern or components, feel free to do so.

## Prerequisites

Have Android Studio and JDK installed in your computer to be able to run the project.

## Task

In the Android project, try to achieve the following:

* Make a simple UI that flashes and plays a click once per second.
* Capture audio from a mic with as low latency as possible
* Implement a simple transient detection algorithm that tells when a note is played.
* Show the detected transients in the UI.
* As soon as the transient detection algorithm is triggered, play a short audio clip. It can be implemented using an internal sampler if there is one. Can you tell where all the latency is coming from?
* Implement a simple monophonic pitch detection algorithm with as low latency as possible and show the result in the UI.

## Deliverables

Host the project with your changes in a repository and share it with us for review
