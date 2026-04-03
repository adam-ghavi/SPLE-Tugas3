#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.adam2config --module-path aisco.product.adam2config -m aisco.product.adam2config &

wait