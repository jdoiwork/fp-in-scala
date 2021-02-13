FROM ubuntu

SHELL ["/bin/bash", "-c"]

RUN apt-get update && \
    apt-get install curl zip -y && \
    curl -s "https://get.sdkman.io" | bash && \
    source "/root/.sdkman/bin/sdkman-init.sh" && \
    sdk install java 15.0.2.hs-adpt  && \
    sdk install scala && \
    sdk install sbt && \
    mkdir /sbt-work && \
    cd /sbt-work && \
    sbt --version

WORKDIR /sbt-work

CMD [ "/bin/bash" ]
