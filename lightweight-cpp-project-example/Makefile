# Simple makefile to example

build: newCPPTemplate.cpp build/newCPPTemplate.o
	g++ newCPPTemplate.cpp -o build/newCPPTemplate.o

build/newCPPTemplate.o: newCPPTemplate.cpp

clean:
	rm -f build/newCPPTemplate.o
	rm -f build/compile_commands.json

run: build
	build/newCPPTemplate.o
	
sonarlint:
	compiledb -o build/compile_commands.json make