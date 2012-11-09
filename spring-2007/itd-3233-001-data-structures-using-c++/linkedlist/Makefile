# Makefile for linked lists
# $Id$

CFLAGS=-O2
SRCS=list.cpp
OBJS=list.o
CC=c++

all:	linkedlist

clean:
	-rm -rf *.o linkedlist

linkedlist: $(OBJS)
	$(CC) $(CFLAGS) -o $@ $(OBJS)
