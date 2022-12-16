#!/usr/bin/env fish

if test (count $argv) -lt 1
  echo "Usage: jflexScriptFish.fish nomeScanner"
else
  echo $argv[1]
  jflex *.jflex && javac $argv[1].java && java $argv[1] *.txt
end