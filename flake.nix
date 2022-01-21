{
  description = "Java project dev shell";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem (
      system:
      let
        pkgs = nixpkgs.legacyPackages.${system};
      in
      {
        devShell = pkgs.mkShell {
          buildInputs = with pkgs; [
            #jdk
            adoptopenjdk-hotspot-bin-16
            maven
            gradle
          ];
          JAVA_HOME = "${pkgs.adoptopenjdk-hotspot-bin-16}";
        };
      }
    );
}
