#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.adam1config --module-path aisco.product.adam1config -m aisco.product.adam1config &

wait