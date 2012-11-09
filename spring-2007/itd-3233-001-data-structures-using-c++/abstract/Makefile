# Makefile for abstract classes, ordered collections, etc.
# $Id$

CFLAGS=-O2
SRCS=ordercol.cpp
OBJS=ordercol.o
CC=c++

all:	ordercol

clean:
	-rm -rf *.o ordercol

ordercol: $(OBJS)
	$(CC) $(CFLAGS) -o $@ $(OBJS)
