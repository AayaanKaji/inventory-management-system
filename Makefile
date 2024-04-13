JAVAC = javac

SRC_DIR = src
OUT_DIR = build
MAIN_CLASS = Main

JAVAC_FLAGS = -d $(OUT_DIR)

SOURCES = $(wildcard $(SRC_DIR)/**/*.java)

OBJECTS = $(SOURCES:$(SRC_DIR)/%.java=$(OUT_DIR)/%.class)

all: chmod_generate_db generate_db compile run

chmod_generate_db:
	chmod +x generate_database.sh

generate_db:
	./generate_database.sh

compile:
	$(JAVAC) $(JAVAC_FLAGS) $(SRC_DIR)/$(MAIN_CLASS).java

run:
	java -cp $(OUT_DIR) $(SRC_DIR).$(MAIN_CLASS)

clean:
	rm -rf $(OUT_DIR)

.PHONY: all chmod_generate_db generate_db compile run clean
