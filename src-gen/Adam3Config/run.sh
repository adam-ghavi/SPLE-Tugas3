#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.adam3config --module-path aisco.product.adam3config -m aisco.product.adam3config &

wait