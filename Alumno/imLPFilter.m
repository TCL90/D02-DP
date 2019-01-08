function out = imLPFilter (in)

mask = [1 4 7 4 1; 4 16 26 16 4; 7 26 41 26 7; 4 16 26 16 4;1 4 7 4 1 ]/273;    %Máscara de Gauss

out1 = imConvolve(in, mask);
out = imRemap(out1);


endfunction
