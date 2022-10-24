#!/bin/bash

function compile(){
	javac DueDateCounter.java
}

function run(){
	java DueDateCounter < sampleInput.txt
}

function runProgram(){
	compile
	run
	
}


runProgram

