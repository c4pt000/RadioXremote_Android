# sdkmanager --install 'build-tools;27.0.2' 'platform-tools' 'platforms;android-27' 'tools'

echo "requires JAVA 8 to build apk signing tool requires JAVA 11"
echo "visit https://github.com/c4pt000/Aqua-Term for java11 and java8 fast switching scripts"
./gradlew clean
./gradlew build


echo "sh create-keystore-and-sign.sh to sign the apk for distribution" 
