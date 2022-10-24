#!/bin/bash

function compile(){
	javac DueDateCounter.java
}

function run(){
	java DueDateCounter
}

function runProgram(){
	compile
	run
	
}


runProgram
