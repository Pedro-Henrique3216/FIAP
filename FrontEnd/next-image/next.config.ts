import type { NextConfig } from "next";
 
const nextConfig: NextConfig = {
  images:{
    formats:['image/webp','image/avif'],
    remotePatterns:[
      {
        protocol: 'https',
        hostname: 'media.gazetadopovo.com.br',
        pathname: '**'
      }
    ]
  }
};
 
